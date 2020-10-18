// 1015 과제 03-3
package h.jdbc.ex03;

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
	
	// 문자열과 금액을 입력 받고, 입력된 문자열이 이름에 포함되고 입력 받은 금액 이상의 연봉을 받는 사원들의 
	// 사번, 이름, 연봉을 출력하는 프로그램 작성. 단, 입력 받은 문자열과 이름을 비교할 때는 대소문자 구분하지 않고 비교!
	public void printEmployee(String name, int salary) throws SQLException  {
		
		// 1단계 :: login
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(dburl, "hr", "hr");
	
		// 2단계 :: SQL 쿼리 전송
		String sql = "select employee_id, first_name, salary "
				+ "from	employees "
				+ "where upper(first_name) like upper('%' || ? || '%') "
				+ "and salary >= ? "
				+ "order by employee_id";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		// PreparedStatement method 사용해서 데이터 세팅 (' ' 불필요!)
		pstmt.setString(1, name);
		pstmt.setInt(2, salary);
		
		// 3단계 :: 결과 확인
		ResultSet rs = pstmt.executeQuery(); // select(query) 니까 ResultSet
						
		while(rs.next()) {
							
			int employee_id = rs.getInt(1);
			String first_name = rs.getString(2);
			int salary2 = rs.getInt(3);
							
			System.out.println(employee_id+"\t"+first_name+"\t"+salary2);
		}
				
		if (pstmt !=null)
			pstmt.close();
		if (con !=null)
			con.close();
		
	}
	
	public static void main(String[] args) throws SQLException {
		
		new EmpManager().printEmployee("al", 4000);

	}

}