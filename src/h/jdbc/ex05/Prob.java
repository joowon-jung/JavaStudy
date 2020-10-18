// 1015 과제 05-3
package h.jdbc.ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Prob {

	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("부서의 아이디를 입력하세요...");
			System.exit(1);
		}

		String dept_id = args[0];
		
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null; // 컬럼명 출력하기 위함
		
		try {
			// 1단계 :: login
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			con = DriverManager.getConnection(dburl, "hr", "hr");
			
			// 2단계 :: SQL 쿼리 전송
			
			String sql = "select e.employee_id, d.department_name, e.salary, av.avg "
					+ "from	employees e, departments d, (select department_id, avg(salary) avg "
														+ "from employees " 
														+ "group by department_id) av "
					+ "where e.department_id = d.department_id "
					+ "and d.department_id = av.department_id "
					+ "and d.department_id = ? "
					+ "order by e.employee_id, e.salary desc";
			
			pstmt = con.prepareStatement(sql);
			
			// PreparedStatement method 사용해서 데이터 세팅 (' ' 불필요!)
			pstmt.setInt(1, Integer.parseInt(dept_id));
			
			// 3단계 :: 결과 확인
			rs = pstmt.executeQuery(); // select(query) 니까 ResultSet
			
			/* 컬럼명 출력하기 위함 */
			rsmd = rs.getMetaData(); // ResultSet 객체로 getMetaData 메서드 호출하여 ResultSetMetaData 객체 생성 
			int cols = rsmd.getColumnCount(); // ResultSetMetaDat의 getColumnCount : 컬럼의 개수 반환 
			
			// 컬럼 목록 보여줌
			for (int i = 1; i <= cols; i++) { // SQL은 index가 1부터 시작!
				System.out.print(rsmd.getColumnName(i)+"\t"); // 컬럼명 반환
			}
			System.out.println();
			
			while(rs.next()) {
				
				int employee_id = rs.getInt(1);
				String department_name = rs.getString(2);
				int salary = rs.getInt(3);
				int avg = rs.getInt(4);
								
				System.out.println(employee_id+"\t\t"+department_name+"\t"+salary+"\t"+avg);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
