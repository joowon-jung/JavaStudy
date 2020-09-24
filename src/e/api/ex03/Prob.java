//eApi03.jpg

package e.api.ex03;
//static 붙여서도 실행해보기!
//클래스.메소드 이름 가능
//메소드 이름 가능 

public class Prob {
	
	//못품
	public static String leftPad(String str, int size, char padChar) {
		
		int length = str.length(); //입력 문자열의 길이
		
		if (length >= size) {
			return str;
		}
		
		String result = ""; //초기화
		for (int i = 0; i < size-length; i++) {
			result += padChar;
		}
		result += str;
		
		return result;
	}
	
	public static void main(String[] args) {
		
//		Prob15 prob3 = new Prob15();
		
		System.out.println(leftPad("ABC", 6, '#'));
//		System.out.println(Prob15.leftPad("ABC", 6, '#'));
		//같은 클래스의 static 은 클래스 이름 안 써줘도 되지만
		//클래스 이름.메소드명 으로 접근하는 습관을 들이자!
		
		/*
		 * 원래 메소드 접근 할 때
		 * Prob15 prob3 = new Prob15(); 해서
		 * System.out.println(prob3.leftPad("ABC", 6, '#'));
		 * 이렇게 접근했었음 !
		 */
		System.out.println(Prob.leftPad("ABC", 5, '$'));
		System.out.println(leftPad("ABC", 2, '&'));
	}

}
