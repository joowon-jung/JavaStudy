// 1015 과제 06-3
package h.jdbc.ex06;

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
	
	// 입력받은 도시명과 최소, 최대 급여를 이용하여 'South San Francisco' 에서
	// 근무하는 직원들의 이름, 부서명을 출력하는 프로그램 작성 
	public void printEmployee(String city, int lo, int hi) throws SQLException {
		
		// 1단계 :: login
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(dburl, "hr", "hr");
		
		// 2단계 :: SQL 쿼리 전송
		String sql = "select e.first_name, d.department_name "
				+ "from	employees e, departments d "
				+ "where e.department_id = d.department_id "
				+ "and d.location_id = ( select location_id "
										+ "from locations "
										+ "where city = ? ) "
				+ "and e.salary between ? and ?";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		// PreparedStatement method 사용해서 데이터 세팅 (' ' 불필요!)
		pstmt.setString(1, city);
		pstmt.setInt(2, lo);
		pstmt.setInt(3, hi);
		
		// 3단계 :: 결과 확인
		ResultSet rs = pstmt.executeQuery(); // select(query) 니까 ResultSet
		
		while(rs.next()) {
			
			String first_name = rs.getString(1);
			String department_name = rs.getString(2);
							
			System.out.println(first_name+"\t\t"+department_name);
		}
	}
	
	public static void main(String[] args) throws SQLException {
		
		new EmpManager().printEmployee("South San Francisco", 7000, 10000);
		
	}

}
