//aBase01.jpg

package a.base.ex01;
import java.util.Scanner;

public class Prob {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //인스턴스 생성
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int input = keyboard.nextInt(); //nextInt(): 스캔하는 행위를 하는 메소드
		
		if(input < 2 || input > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return; //프로그램 종료
		}
		
		for(int i = 1; i < 10; i++) {
			System.out.println(input + "*" + i + "=" + input*i);
		}
	}
}
