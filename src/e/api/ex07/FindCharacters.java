// Day17 과제 두번째 장
package e.api.ex07;

// 개발 편의성을 위해 Bean과 App을 합쳐놓은 것
// API 싸움! 노가다 한 것 API 잘 사용해서 해보기!
public class FindCharacters {

	///method 
	// 문자열의 각 내용들을 비교하여 입력받는 char c 의 값과 동일한 char의 개수를 리턴하는 메소드
	// 대소문자 각각 다른 것으로 간주
	public int countChar(String str, char c) {
//		int sum = 0;
//		for (int i = 0; i < str.length(); i++) {
//			
//			if (str.charAt(i) == c) {
//				sum++;
//			}
//			
//		}
//		return sum;
		
		char[] charArr = str.toCharArray(); // toCharArray() : String str을 CharArray로 한 문자씩 저장해줌!
		int count = 0;
		for (char tempC : charArr) { // enhanced for loop
									 // charArr.length 만큼 돌려서 char[]에서 하나씩 뽑아 tempC에 저장. 값 비교!
			if (tempC == c) {
				count++;
			}
		}
// 위의 enhanced 포문과 동일 !!
//		for (int i = 0; i < charArr.length; i++) {
//			char tempC = charArr[i];
//			
//			if (tempC == c) {
//				count++;
//			}
//		}
		return count++;
	}
	
	///main method
	public static void main(String[] args) {
		FindCharacters fc = new FindCharacters();
		int count = fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);
	}
}
