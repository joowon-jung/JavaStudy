// Day 16 과제 세번째 장
package e.api.ex10;
// Array 를 거꾸로 Vector 에 집어넣고, 문자열까지 거꾸로 !

import java.util.List;
import java.util.Vector;

public class Prob {
	
	///Field
	///Constructor
	///Method
	
	// String[]의 내용을 역순으로 출력하되 각 문자열 또한 역순으로 변환하여 출력하는 메소드
	
	// Vector 타입 말고 메서드 시그니쳐를 List 인터페이스로 바꿔보기 !
	// ==> 메소드도 Vector 안의 구체적인 메소드 말고 List 인터페이스 오버라이딩한 메소드 사용해보기
	public List <String> dataChange (String[] strData) {
		
		List <String> vector = new Vector <String> ();
		
		for (int i = strData.length - 1; i >= 0; i--) { // 거꾸로 받기 위함
			StringBuffer sb = new StringBuffer(strData[i]); // 문자열 집어넣음
			sb.reverse(); // reverse() : StringBuffer 클래스 안의 문자열 거꾸로 하는 메소드
			vector.add(sb.toString()); //toString() : StringBuffer를 String화 함
			
			//System.out.println(sb); StringBuffer sb를 출력하면 toString이 생략된 구조
			//SOP 안에서 말고 StringBuffer타입을 String화 하고 싶으면 toString() 사용!
									   
		}
		return vector;
	}

	///main method
	public static void main(String[] args) {
		
		Prob st = new Prob();
		String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet" };
		List<String> v = st.dataChange(strData);
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("===============");
		
		// enhanced for loop 문 사용해보기
		for (String value : v) {
			System.out.println(value);
		}
	}
}
