//eApi05.jpg

/*
상태값과 무관한 행위를 하는 static 메소드 만들기
클래스 이름으로 접근하는게 좋다! (같은 클래스에서는 안써도 되지만)
 */
package e.api.ex06;

public class Prob {

	public static String myReplace(String str, char oldChar, char newChar) {
		
		String newStr = ""; 
		
		for(int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
			if(str.charAt(i) == oldChar) {
				newStr += newChar;
			} else {
				newStr += str.charAt(i); //그대로
			}
		}
		return newStr;
	}
	
	public static void main(String[] args) {
		
		System.out.println("문자열에 특정문자 변경하는 테스트");
		System.out.println("---------Sample 1 -------");
//		String str1 = myReplace("hello world", 'l', '*');
		String str1 = Prob.myReplace("hello world", 'l', '*');
		System.out.println(str1);
		System.out.println(str1.toString()); //toString() 생략된 구조!
		
		System.out.println("---------Sample 2 -------");
		String str2 = myReplace("hello world", ' ', '-');
		System.out.println(str2);
		
		System.out.println("---------Sample 3 -------");
		String str3 = myReplace("hello world", 'a', '*');
		System.out.println(str3);
	
	}
}
