// 1015 과제 07-3
package h.jdbc.ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prob {

	// 매개변수로 받은 도시명과 부서이름에 해당하는 직원 목록을 출력하는 메소드
	// 조건 : printEmployeeList() 메소드 호출 시, 인자로 주어지는 도시명과 부서명은 대소문자 구분 없이 입력되며
	// 이름의 일부만 입력되는 것으로 가정. 예 ) "lake", "it"
	private static void printEmployeeList(String cityName, String deptName) throws Exception {
		
		// 1단계 :: login
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(dburl, "hr", "hr");
		
		// 2단계 :: SQL 쿼리 전송
		String sql = "select l.city, d.department_name, e.first_name, e.salary test_salary "
						+ "from	employees e, departments d, locations l "
						+ "where e.department_id = d.department_id "
						+ "and d.location_id = l.location_id "
						+ "and upper(l.city) like upper('%' || ? || '%')  "
						+ "and upper(d.department_name) like upper('%' || ? || '%') ";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		// PreparedStatement method 사용해서 데이터 세팅 (' ' 불필요!)
		pstmt.setString(1, cityName);
		pstmt.setString(2, deptName);
		
		// 3단계 :: 결과 확인
		ResultSet rs = pstmt.executeQuery(); // select(query) 니까 ResultSet
		
		while(rs.next()) {
			
			String city = rs.getString("city");
			String department_name = rs.getString("department_name");
			String first_name = rs.getString("first_name");
			int salary = rs.getInt("test_salary");
							
			System.out.println(city+"\t\t"+department_name+"\t\t"+first_name+"\t\t"+salary);
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		printEmployeeList("lake", "it");
	}

}
