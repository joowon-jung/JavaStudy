// Day 16 과제 다섯번째 장
package e.api.ex12;

public class Prob {

	// URL에서 paramName에 해당하는 값 리턴하는 메소드
	// e.api.ex08 파싱 노가다 했던 것을 api 이용하여 간단하게 할 수 있
	private static String getParameter(String url, String paramName) {
		
		int index = url.indexOf("?"); // 22
		String tmp1 = url.substring(index + 1, url.length()); // 물음표 다음 문자부터 끝까지 자름
		
		String[] tmp2 = tmp1.split("&"); // split() : 특정 문자를 기준으로 문자열을 나누어 배열에 저장
		
		String result = null;
		
		for (int i = 0; i < tmp2.length; i++) {
			
			if (tmp2[i].startsWith(paramName)) { // startsWith() : 문자열이 특정 문자열로 시작하는지 확인
				String[] tmp3 = tmp2[i].split("=");
				result = tmp3[1]; // tmp3[0] : prodName , tmp3[1] : 갤럭시3
				break; // for문 종료
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";
		
		String prodName = getParameter(url1, "prodName");
		System.out.println("제품 이름 : " + prodName);
		
		String url2 = "http://localhost/registUser?userId=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";
		
		String userAddress = getParameter(url2, "address");
		System.out.println("회원 주소 : " + userAddress);
	}
}
