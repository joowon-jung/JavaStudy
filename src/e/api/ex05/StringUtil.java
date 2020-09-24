//eApi05.jpg

/*
또 private static 

static은 클래스 이름으로 접근
같은 클래스 안에서는 클래스이름 안 써줘도 됨
*/
package e.api.ex05;

public class StringUtil {

	private static String replaceString(String[] arr) {

		int sum = 0, max = 0; 
		int index = 0;
		String result;

		for (int i = 0; i < arr.length; i++) {
			
			sum = 0; //초기화
			
			for (int j = 0; j < arr[i].length(); j++) { //배열 안의 방
				if(arr[i].charAt(j) == 'a') { //한 '문자'씩 확인
					sum++; //a 있으니까 갯수 증가
				}
			}
			
			if(sum>=max) { //0보다 크면
				max = sum; //max값에 sum 대입하고
				index = i; //현재 배열의 방 넘버(index) 대입
			}
		}
		
		result = arr[index].replace('a','A');
		
		return result;
	}

	public static void main(String[] args) {

		String[] arr = { "java program", "array", "java program area", "append" };
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 : " + result);

	}
}