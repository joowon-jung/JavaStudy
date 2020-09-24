//bMethod06.jpg

/*
메인메소드에 때려박은 팩토리얼 짜는 것을
재사용성 증가 위해 메소드로 추출

Recursive 알고리즘 한번 검색해보기
*/
package b.method.ex06;

import java.util.Scanner;

public class FactorialUtil {

	///Field
	
	
	///Method
	public int factorial(int n) {

//		int multi = 1;
//		for (int i = 1; i <= n; i++) {
//			multi = multi  * i; 
//		}
//		return multi;
		
		if (n != 1) {
			return n * factorial(n-1); //this.factorial(n-1)
		}
		else {
			return n; 
		}
	}
	
	///Main Method
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input        = ");

		FactorialUtil util = new FactorialUtil();
		System.out.print("Result = " + util.factorial(keyboard.nextInt()));
	}
}
