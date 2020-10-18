// 1015 과제 04-3
package h.jdbc.ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpManager {
	
	static { // Driver 이름은 변하지 않으니까 static 부분으로 넣어준 것 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String jobs[]) throws SQLException {
		
		// 1단계 :: login
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(dburl, "hr", "hr");
		
		// 2단계 :: SQL 쿼리 전송
		
		String jobs1 = jobs[0];
		String jobs2 = jobs[1];
		
		String sql = "select employee_id, first_name, salary "
				+ "from employees "
				+ "where job_id in (select job_id "
				+ "from jobs "
				+ "where job_title in (?, ?))";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		// PreparedStatement method 사용해서 데이터 세팅 (' ' 불필요!)
		pstmt.setString(1, jobs1);
		pstmt.setString(2, jobs2);
		
		// 3단계 :: 결과 확인
		ResultSet rs = pstmt.executeQuery(); // select(query) 니까 ResultSet
		
		while(rs.next()) {
			
			int employee_id = rs.getInt(1);
			String first_name = rs.getString(2);
			int salary = rs.getInt(3);
							
			System.out.println(employee_id+"\t"+first_name+"\t"+salary);
		}
		
		if (pstmt !=null)
			pstmt.close();
		if (con !=null)
			con.close();
		
	}
	
	public static void main(String[] args) throws SQLException {
		
		String[] jobs = {"Accountant", "Stock Clerk"};
		new EmpManager().printEmployee(jobs);
	}

}
