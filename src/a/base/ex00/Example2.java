//scan0203.jpg

package a.base.ex00;

public class Example2 {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);

		if (a <= 0 || a >= 10) { // Validation check
			System.out.println("1~9까지의 값을 입력해주세요.");
			return; // 프로그램 여기서 끝내버림
		}

		System.out.println(a + "단을 출력합니다");
		for (int i = 1; i <= a; i++) {
			System.out.println(i + " * " + a + " = " + i * a);
		}
	}
}
