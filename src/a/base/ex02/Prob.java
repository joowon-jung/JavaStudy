//aBase02.jpg

package a.base.ex02;

public class Prob {

	public static void main(String[] args) {

		int limit = 50;
		boolean prime = false;

		for (int i = 2; i <= limit; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) { // 나누어 떨어지면
					prime = false; // 소수가 아님
					break; // 중첩 된 for문 빠져나감
				} else {
					prime = true;
				}
			}
//			< refactoring >
			
//			prime = true;
//			
//			for (int j = 2; j < i; j++) {
//				
//				if (i % j == 0) {
//					prime = false;
//					break;
//				}
//			}
			
			if (prime) { // if (true=prime) 일 때
				System.out.println(i);
			}
		}
	}
}
