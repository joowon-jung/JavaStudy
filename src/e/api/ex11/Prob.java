// Day 16 과제 번째 장
package e.api.ex11;

public class Prob {

	
	// 인자로 받은 문자열을 인코딩하여 리턴시켜주는 매서드
	// 영문자 대소문자이거나 숫자인 경우에는 그대로 리턴, 한글인 경우에는 16진수 값으로 변환 후
	// 변환한 값 앞에 '%' 기호 추가 
	public String toEncoding(String str) {
		
		return null;
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
