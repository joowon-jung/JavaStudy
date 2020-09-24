//scan0203.jpg

package a.base.ex00;
// 10 1 으로 입력 받았을 경우에도 출력이 가능하게 해야 함

public class Example3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = 0;

		if (a == b) {
			System.out.println("입력값이 같습니다");
			return;
		}

//		else if (a < b) {	// ex) 1 10 입력했을 때
//			for (int i = a; i <= b; i++) {
//				sum += i;
//			}
//			System.out.println(a + " ~ " + b + "의 합은" + sum);
//		}
//
//		else if (b < a) {	// ex) 10 1 입력했을 때 
//			for (int i = b; i <= a; i++) {
//				sum = sum + i; //sum +=i;
//			}
//			System.out.println(b + " ~ " + a + "의 합은" + sum);
//		}

		// ★ for문 하나 써서
		// swap해보기

		else if (b < a) { // 예를들어 10 1 일 때

			// swap
			a = Integer.parseInt(args[1]);
			b = Integer.parseInt(args[0]);

		}

		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + " ~ " + b + "의 합은" + sum);

	}

}
