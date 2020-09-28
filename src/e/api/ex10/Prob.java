// Day 16 과제 세번째 장
package e.api.ex10;
// Array 를 거꾸로 Vector 에 집어넣고, 문자열까지 거꾸로 !
import java.util.Vector;

public class Prob {
	
	///Field
	///Constructor
	///Method
	
	// String[]의 내용을 역순으로 출력하되 각 문자열 또한 역순으로 변환하여 출력하는 메소드
	public Vector <String> dataChange (String[] strData) {
		
		Vector <String> vector = new Vector <String> ();
		
		for (int i = strData.length - 1; i >= 0; i--) {
			vector.add(strData[i]);
		}
		
		return vector;
	}

	///main method
	public static void main(String[] args) {
		
		Prob st = new Prob();
		String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet" };
		Vector<String> v = st.dataChange(strData);
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
		
		// enhanced for loop 문
		for (String value : v) {
			System.out.println(value);
		}
	}
}
