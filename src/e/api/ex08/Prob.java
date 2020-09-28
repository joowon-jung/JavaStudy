// Day 16 과제 두번째 장
package e.api.ex08;
// # 기준으로 문자열 파싱한 후 array return 하기

public class Prob {
	
	// 첫 번째 문자열을 두번째 문자열의 구분자로 잘라내어 배열에 저장한 후 리턴하는 메서드 구현
	private static String[] stringSplit(String str1, String str2) {
		
		int index = str1.indexOf("#");
		String[] split = null;
		
		String split1 = str1.substring(0, index);
		System.out.println(split1);
		String split2 = str1.substring(index+1);
		System.out.println(split2);

		// ?
		
		return split;
	}
	
	public static void main(String[] args) {
		
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#"); //Prob.stringSplit 도 가능!
		System.out.println("==== 문자열 처리 결과 ====");
		for (int i = 0; i > strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
