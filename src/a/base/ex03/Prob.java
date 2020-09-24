//aBase03.jpg 

package a.base.ex03;
import java.util.Scanner;

public class Prob {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요: ");

		int inputInt = keyboard.nextInt();
		int multi = 1; //곱할 값 변수 초기화

		if (inputInt < 2 || inputInt > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return; // 프로그램 종료
		}

		for (int i = 1; i <= inputInt; i++) {
			multi = multi * i;
			System.out.println(i + " ! = " + multi);
		}
	}
}
