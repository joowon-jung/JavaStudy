//bMethod13.jpg

package b.method.ex13;
//static 붙여서도 실행해보기!
//클래스.메소드 이름 가능

class Util {

	// 인자로 받은 limit까지의 소수의 갯수를 return 하는 Method
	public static int findPrimeCount(int limit) {

		int count = 0;
		boolean prime;

		for (int i = 2; i <= limit; i++) {

			prime = true; // 디폴트 값 true로 초기화

			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // 나누어 떨어지면
					prime = false; // 소수가 아님
					break; // 안쪽 for문 종료
				}
			}

			if (prime) { // prime = true
				count++;
				//System.out.println(i); //확인
			}
		}
		return count;
	}

	// 인자로 받은 limit까지의 소수갯수 배열크기를 갖는 int 배열에 담아 return 하는 Method
	public static int[] findPrimeReturnArray(int limit) {
		
		int[] array = new int[findPrimeCount(limit)];
		boolean prime;
		int k = 0;
		
		for (int i = 2; i <= limit; i++) {

			prime = true; // 디폴트 값 true로 초기화

			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // 나누어 떨어지면
					prime = false; // 소수가 아님
					break; // 안쪽 for문 종료
				}
			}

			if (prime) { // prime = true
				array[k] = i;
				k++;
			}
		}

		return array;
	}
}

public class Prob {

	public static void main(String[] args) {

		int limit = 67;
//		Util util = new Util(); -> 이렇게 인스턴스 생성하면 인스턴스 메소드로 접근해야 함

		int primeCount = Util.findPrimeCount(limit); 
		System.out.println("1~" + limit + "까지의 소수의 개수는 " + primeCount + "개 이며 소수는 아래와 같다.");

		System.out.println("////////////////////////////////////////////");

		int[] primeArray = Util.findPrimeReturnArray(limit);

		for (int i = 0; i < primeArray.length; i++) {
			//삼항연산자는 readability 가 떨어지지만, 알면 정말 간편하다! 때에 따라 유용
			System.out.print(primeArray[i] + ((primeArray.length - 1) != i ? "." : ""));
		}
	}

}