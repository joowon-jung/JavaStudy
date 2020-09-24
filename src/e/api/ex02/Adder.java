//eApi02.jpg
/*
 		CSV를 기준으로 문자열을 분리 : 파싱
 */

package e.api.ex02;

public class Adder {

	
	public static void main(String[] args) {
		Adder adder = new Adder();
		String expr = "3+5+9+1"; 
		System.out.println(expr + "=" + adder.execute(expr));
		expr = "11+45+77+3";
		System.out.println(expr + "=" + adder.execute(expr));
		expr = "33+51+12+11";
		System.out.println(expr + "=" + adder.execute(expr));
	}
	
	public int execute(String expr) {
		int result = 0;
		String strNum = "";
		
		for (int i = 0; i < expr.length(); i ++) {
			char c = expr.charAt(i); //한문자씩 for문 돌림
			if (c == '+') { 
				result += Integer.parseInt(strNum); //ex) strNum = "3"; strNum = "5"; ..
													//를 계속 int로 바꿔서 result에 담음
				strNum = ""; //strNum 초기화
			} else {
				strNum += c;
//				System.out.println(strNum);
			}
		}
//		System.out.println(result);
//		System.out.println(Integer.parseInt(strNum));
		return (result + Integer.parseInt(strNum));
		//result : 3+5+9+1 이면 1을 제외하고 3+5+9 까지만 더한 결과값
		//Integer.parseInt(strNum) : 3+5+9+1 이면 마지막 1이 String strNum에 담겨서 int로 형변환된 결과값 
		//문자 형태에 숫자가 들어가면 int를 리턴하는 것 : Integer.parseInt
	}

	// 파싱하는 내 논리
}
