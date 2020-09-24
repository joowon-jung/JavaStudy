//aBase04.jpg

package a.base.ex04;

import java.util.Scanner;

public class Prob {

	public static void main(String[] args) {

		int number = 0;
		int count = 0;
		int sum = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요. : ");
		number = keyboard.nextInt();

		for (int i = 1; i <= 1000; i++) {
			if (i % number == 0) { // 배수 일 때
				count++; // 배수 개수 증가
				sum+=i;  // 배수를 계속 더해줌
			}
		}

		System.out.println(number + "의 배수 개수 = " + count);
		System.out.println(number + "의 배수 합 = " + sum);
	}
}

