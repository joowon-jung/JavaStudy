//aBase10.jpg

/*
최고값, 최소값, 토탈값, 평균(double) 구하기
args를 한꺼번에 관리하기 위해 배열 사용
main 메소드에 다 때려박고 논리야 놀자 연습
*/
package a.base.ex10;

public class Prob {
	
	public static void main(String[] args) {
		
		int largest = 0;
		int smallest = 10000;
		int sum = 0;
		double average = 0.0;
		
		int[] array = new int[args.length];
		
		for(int i = 0; i < args.length; i++) {
			
			System.out.print(args[i]+",");
			
			int intArgs = Integer.parseInt(args[i]);
			smallest = Integer.parseInt(args[0]);
			
			if (intArgs > largest) {
				largest = intArgs;
			} else if (intArgs < smallest) {
				smallest = intArgs;
			}
			sum += intArgs;
		}
		average = (double) sum / args.length;
		
		System.out.println("\n==================");;
		
		
		System.out.println("the largest value = " + largest);
		System.out.println("the smallest value = " + smallest);
		System.out.println("the total value = " + sum);
		System.out.println("and the average is = " + average);
	}

}
