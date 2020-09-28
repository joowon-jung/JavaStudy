// Day 16 과제 첫번째 장
package b.method.ex03;

public class ArrayUtil {

	// 문자 배열의 순서를 뒤집어서 char 배열로 리턴하는 메소드
	public char[] reverseString(char[] s, int start, int end) {
		
		for (int i = start; i <= end; i++) {
			
			char temp1 = s[i];
			char temp2 = s[(end - i) + start];
			System.out.print(temp1);
			System.out.print(temp2);
			System.out.println();
			// ?

		}
		
		return s;
	}

	public static void main(String[] args) {

		ArrayUtil au = new ArrayUtil();
		char[] s = { 'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm' };
		System.out.println(au.reverseString(s, 0, 3));
//		System.out.println(au.reverseString(s, 4, 7));
//		System.out.println(au.reverseString(s, 8, 10));
//		System.out.println(au.reverseString(s, 0, 10));
	}
}
