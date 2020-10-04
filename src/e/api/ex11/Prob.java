// Day 16 과제 네번째 장
package e.api.ex11;

public class Prob {

	// 인자로 받은 문자열을 인코딩하여 리턴시켜주는 매서드
	// 영문자 대소문자이거나 숫자인 경우에는 그대로 리턴, 한글인 경우에는 16진수 값으로 변환 후
	// 변환한 값 앞에 '%' 기호 추가 
	public String toEncoding(String str) {
		
		String value = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i); // 한 문자씩
			
			if ( (c >= 'A' && c <= 'z') || (c >= '0' && c <= '9' || c == ' ') ) {
				value +=c; // 그대로
			} else {
				
				String temp = c + ""; // "" 왜 붙는 거? 
									  // c만 있으면 char이라 오류나는데 ""가 String이라서 오류 안 남!
				byte[] strBytes = temp.getBytes(); 
				// String 안의 getBytes() 메소드 : 문자열을 byte로 변환하는 메소드
				// 컴퓨터가 저장할 수 있는 유일한 것은 byte이다. 문자열은 컴퓨터에 직접 저장할 수 없으므로
				// 먼저 인코딩 (바이트로 변환) 해야 함!
				for (int j = 0; j < strBytes.length; j++) {
					value += "%" + Integer.toHexString(strBytes[j]) .toUpperCase().substring(6, 8);
					// Integer 안의 toHexString() : 16진수로 변환 
					// String 안의 toUpperCase() : 대문자로 변환
					// String 안의 substring(6, 8) : index가 6,7 인 것만 자름
				}
			}
		}
		return value;
	}
	
	public static void main(String[] args) {
		
		/************ 힌트 : 16진수 변환 *************/
		/*
		String value = "홍";
		byte[] temp = value.getBytes(); // String.class 안의 getBytes() 메소드
		 
		System.out.println(Integer.toHexString(temp[0])); // Integer.class 안의 static 메소드
														  // => 클래스 명으로 접근 했으니까!
		System.out.println(Integer.toHexString(temp[1]));
		
		value = "A";
		temp = value.getBytes();
		System.out.println(Integer.toHexString(temp[0]));
		*/
		/************ 힌트 : 16진수 변환 *************/
		
		Prob p1 = new Prob();
		System.out.println("입력 : Korea");
		System.out.println("출력 : " + p1.toEncoding("Korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 : " + p1.toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : " + p1.toEncoding("홍 길 동"));
		System.out.println("입력 : Hong 길 동");
		System.out.println("출력 : " + p1.toEncoding("Hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : " + p1.toEncoding("0319"));
	}
}
