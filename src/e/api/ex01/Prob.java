//eApi01.jpg
/*
    - incoding : 규칙성에 맞게 암호화 한 것
	- decoding : 암호를 푸는 것
    - ASCII CODE : 영문 알파벳을 사용하는 대표적인 문자 인코딩
                   알파벳은 내부적으로 int 값을 가진다.
    
    - charAt() & length()
 */

package e.api.ex01;

public class Prob {

	public static void main(String[] args) {
		
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		char[] source = sourceString.toCharArray();
		
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122 입니다
		// char c = 'a';
		// int i = (int) c;
		// char c1 = (char) i;
		
		//암호화
//		for (int i = 0; i < source.length; i++) {
//			if (source[i] != ' ') {
//				char c = source[i];
//				int ii = (int) c + 3;
//				char c1 = (char) ii;
//				source[i] = c1;
//			}
//		}
	
		for (int i = 0; i < sourceString.length(); i++) {
			if (sourceString.charAt(i) != ' ') { //공백 제외 
				char c = sourceString.charAt(i);
				int ii = (int) c + 3;
				char c1 = (char) ii;
				source[i] = c1;
			}
			if (sourceString.charAt(i) == 'x' || sourceString.charAt(i) == 'y' || sourceString.charAt(i) == 'z') {
				char c = sourceString.charAt(i);
				int ii = (int) c - 23;
				char c1 = (char) ii;
				source[i] = c1;
			}
		}
		
		//char형 array를 하나씩 꺼내 Character.toString 으로 변환
		for (int j = 0; j < source.length; j++) {
			encodedString += Character.toString(source[j]);
		}
		
		System.out.println("암호화할 문자열 : "  + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
}
