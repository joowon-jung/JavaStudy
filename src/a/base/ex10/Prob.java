//aBase10.jpg

/*
최고값, 최소값, 토탈값, 평균(double) 구하기
args를 한꺼번에 관리하기 위해 배열 사용
main 메소드에 다 때려박고 논리야 놀자 연습
*/
package a.base.ex10;

public class Prob {
	
	public static void main(String[] args) {
		
		// 지역변수 (local variable) 초기화 해주기
		int largest = 0;
		int smallest = 10000;
		int sum = 0;
		double average = 0.0;
		
		int[] array = new int[args.length];
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = Integer.parseInt(args[i]);
			           // Integer 클래스 명으로 접근 => static 메소드
			System.out.print(array[i] + ",");
			sum += array[i];
			
			if (array[i] > largest) {
				largest = array[i]; // if & else 에 실행문이 한 줄이면 { } 생략 가능
			}
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		
		average = (double) sum / array.length; // 실수로 값이 나오게 하기 위해 (double) 붙여줌 !
		
		System.out.println("\n==================");;
		
		
		System.out.println("the largest value = " + largest);
		System.out.println("the smallest value = " + smallest);
		System.out.println("the total value = " + sum);
		System.out.println("and the average is = " + average);
	}

}
