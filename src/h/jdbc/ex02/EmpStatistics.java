// 1015 과제 02-3
package h.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpStatistics {
	
	static { // Driver 이름은 변하지 않으니까 static 부분으로 넣어준 것 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 급여가 주어진 금액 이상인 직원들에 대해, 직무별 평균 급여를 출력하는 프로그램 작성
	// 이때, 평균 급여가 큰 순서로 출력
	public void printStatistics(int maxSalary) throws SQLException {
		
		System.out.println("===============================");
		System.out.println("Max Salary : " + maxSalary);
		System.out.println("===============================");
		
		// 1단계 :: login
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, "hr", "hr");
				
		// 2단계 :: SQL 쿼리 전송
		
		String sql = ("select j.job_title, avg(e.salary) "
					+ "from	employees e, jobs j "
					+ "where e.job_id = j.job_id "
					+ "and e.salary >= ? "
					+ "group by j.job_title "
					+ "order by avg(e.salary) desc");
					
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1,  maxSalary);
				
		// 3단계 :: 결과 확인
		ResultSet rs = pstmt.executeQuery(); // select(query) 니까 ResultSet
				
		while(rs.next()) {
					
			String job_title = rs.getString(1);
			int avg = rs.getInt(2);
					
			System.out.println("[" + job_title + "] " + avg);
		}
		
		if (pstmt !=null)
			pstmt.close();
		if (con !=null)
			con.close();
				
	}
	
	public static void main(String[] args) throws SQLException {
		
		int maxSalary = 10000;
		new EmpStatistics().printStatistics(maxSalary);
		
		maxSalary = 15000;
		new EmpStatistics().printStatistics(maxSalary);
		
	}

}