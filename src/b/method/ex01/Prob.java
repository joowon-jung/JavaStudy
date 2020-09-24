//bMethod01.jpg

package b.method.ex01;

//Field 
//Method
//Main  
//=> Readibility 개발자 사이의 암묵적인 약속
//필드, 메소드 나오고 필요에 의해 메인 메소드 구현

public class Prob {
	
	
	public int abs(int num1, int num2) {
	
		int temp = num1 - num2;;
		
		if (num1 - num2 < 0) { //음수일 경우
			temp = num2 - num1; //큰 수 - 작은 수
			
		}
		return temp;
		
//		int temp = num1 - num2; 
//		
//		if (temp < 0) { //결과가 음수일 때
//			return temp * -1; //절댓값
//		}
//		 
//		return temp; //양수일 때 그냥 결과 출력
	}
	
	public static void main(String[] args) {
		int num1 = 6; 
		int num2 = 15;
		
		Prob prob = new Prob(); //인스턴스 생성
		System.out.println("두 수의 차는 : " + prob.abs(num1, num2));
		
		//System.out.println("두 수의 차는 : " + new Prob08().abs(num1, num2));
	}

}
