//aBase06.jpg

//중요 ! ★
package a.base.ex06;

public class Prob {

	public static void main(String[] args) {

		int[] array = { 3, 24, 1, 55, 17, 43, 5 };
		int swap = 0;							// 배열 값 저장하기 위한 변수

		//기존 배열 출력
		System.out.println("[배열의 내용]");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
		//배열 Sorting (오름차순)
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) { 		// ex) array[0] > array[1]
					swap = array[j]; 			// array[1]의 값을 담아놓음
					array[j] = array[i]; 		// array[1]에 array[0] 값 대입
					array[i] = swap; 			// array[0]에 array[1] 값 대입
												// swap = array[1]
				}
			}
		}

		//Sorting된 배열 출력
		System.out.println("\n[클래스 실행결과]");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
			//마지막에 , 없이 찍히도록 if문 사용하기
		}
	}
}
