// Day 16 과제 첫번째 장
package b.method.ex03;

public class ArrayUtil {

	// 문자 배열의 순서를 뒤집어서 char 배열로 리턴하는 메소드
	// ** API 이용하기 | 배열 복사 : clone() & arraycopy()
	public char[] reverseString(char[] s, int start, int end) {
		
		// call by value vs call by reference 이해
		// call by reference로 값이 자꾸 바뀌니까 메소드 안에서 임시 temp를 만들어 줘야 함
		char[] tempCharArr = s.clone(); 
		// char[] tempCharArr = s; 라고 하면 배열의 내용을 복사하는게 아니라 주소값이 복사되어
		// 결국 둘 중 하나의 내용을 변경하면 다른쪽의 내용도 변경된다.
		// 그러므로 clone() 메소드를 사용하는 것! 
		// clone() : 배열 복사, 원본 배열과는 별개의 주소값을 가진 새로운 배열을 만듦
		// clone() 으로 만든 배열을 바꿔도 원본이 바뀌지 않음!
		char tempChar; // 임시로 담아놓을 char
		
		while (start < end) {
			tempChar = tempCharArr[start];
			tempCharArr[start] = tempCharArr[end];
			tempCharArr[end] = tempChar;
			start++;
			end--;
		}
		return tempCharArr;
	}

	public static void main(String[] args) {

		ArrayUtil au = new ArrayUtil();
		char[] s = { 'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm' };
		System.out.println(au.reverseString(s, 0, 3));
		System.out.println(au.reverseString(s, 4, 7));
		System.out.println(au.reverseString(s, 8, 10));
		System.out.println(au.reverseString(s, 0, 10));
	}
}
