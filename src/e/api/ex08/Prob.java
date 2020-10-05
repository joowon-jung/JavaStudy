// Day 16 과제 두번째 장
package e.api.ex08;
// # 기준으로 문자열 파싱한 후 array return 하기

public class Prob {
	
	// 첫 번째 문자열을 두번째 문자열의 구분자로 잘라내어 배열에 저장한 후 리턴하는 메서드 구현
	private static String[] stringSplit(String str1, String str2) {
										// 변수이름 str1, str2 하지말고 의미 담아서 짓기!
		
		int start = 0;
		int end = str1.indexOf(str2); // 8
		int delCnt = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == '#') delCnt++; // '#'이 몇개 있는지 count
		}
	
		// #을 기준으로 문자열을 잘라서 담을 새로운 배열 생성
		String[] array = new String[delCnt+1]; // ex) 안녕#나야 -> #으로 구분한 문자열이 2개
											// #은 1개인데 구분되는 문자열은 2개니까 delCnt+1
		
		for (int i = 0; i < array.length; i++) {
			String s = str1.substring(start, end); // 구분자로 문자열 한개씩 자름
			array[i] = s; // 배열에 저장
			start = end + 1; // 9
			
			//int index = str1.indexOf(str2, start + 1); 왜 +1 ????
			int index = str1.indexOf(str2, start); // 위치가 start인 것 부터 str2를 찾아줌
			if (index == -1) { // #이 더이상 없으면
				end = str1.length() - 1; // 마지막 index까지 자르기 위해 -1함
			}
			else {
				end = index; // #이 들어있는 위치 : end
			}
		}
		return array;
	}                               
	
	public static void main(String[] args) {
		
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#"); //Prob.stringSplit 도 가능!
		System.out.println("==== 문자열 처리 결과 ====");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
