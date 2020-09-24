//scan0010.jpg

package a.base.ex00;

public class Test1 {

	public static void main(String args[]) {

		System.out.println("\n\n"); // 개행
		System.out.println("==>실행결과");
		System.out.println("나의 이름은 \"" + args[0] + "\"입니다");
		System.out.println("\"" + args[0] + "\"씨의 [hp]는 \"" + args[1] + "\" 입니다");

		// ==> Java의 primitive data type 8EA
		// ==> Java에서 문자를 나타내는 data type은 String(<== reference data type)
		// ==> reference data type 을 배우기 전 primitive data type 처럼 사용.
		// ==> 입력받은 문자는 String 이라는 문자형으로 받음.

		/*
		 * 
		 * String name = "홍길동"; String name01 = name; String name = args[0]; 다 가능 !
		 * 
		 */

		String name = args[0];
		String hp = args[1];

		System.out.println("나의 이름은 \"" + name + "\"입니다");
		System.out.println("\"" + name + "\"씨의 [hp]는 \"" + hp + "\" 입니다");
		// 문자를 다루는 data type 인 String(reference data type) : 중요 !
	}
}