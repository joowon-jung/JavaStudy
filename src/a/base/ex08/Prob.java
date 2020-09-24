//aBase08.jpg
//command line argument (명령행 매개변수)
//조건에 합당하게 분석 & 요구사항 정의 잘 하기

package a.base.ex08;

public class Prob {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		
		//validation check
		if (args.length != 1) { //argument가 한개가 아니면
			System.out.println("명령행 매개변수를 1개만 입력하세요.");
			return; //main 메소드 종료
		}
		if (num <= 0 || num % 2 == 0) {
			System.out.println("0보다 큰 홀수만 입력 가능합니다.");
			return;
		}

		//재사용성 증가 위해 메소드로 추출해보기 !!
		//나중에 * 을 + 로 바꾸고 싶어질 수도 있고,, 변경하고 싶을수도 있으니
		for (int i = 0; i < (num / 2) + 1; i++) { //세로
			
			//공백 찍기
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			//별 찍기
			for (int k = 0; k < num - (i * 2); k++) {
				System.out.print("*");
			}
			
//			for (int k = num - (i * 2); k > 0; k--) {
//				System.out.print("*");
//			}
			
			System.out.println();
		}
	          
	}
}
