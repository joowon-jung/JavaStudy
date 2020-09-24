//aBase09.jpg

package a.base.ex09;
//명령형 매개변수로도 한번 해보고, 스캐너 사용해서도 한번 해보기

public class Prob {
	
	//Main Method
	public static void main(String[] args) {
							//명령형 매개변수 (program argument)
		
		int num = Integer.parseInt(args[0]);
		
		for (int i = 0; i < num; i++) { // 세로 
			
			// 공백 찍기
			for (int j = 1; j < num - i; j++) {
				System.out.print(" ");
			}
			
			// 별 찍기
			for (int q = 1; q <=  (i * 2) + 1; q++) {
				System.out.print("*");
			}
			System.out.println(); //개행
		}
	}

}
