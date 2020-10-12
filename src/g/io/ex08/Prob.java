package g.io.ex08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Prob {

	// 10개의 중복되지 않는 난수를 생성하여 배열에 저장한 후, 리턴
	private static int[] generateRandomNumber() {

		int[] array = new int[10];
		Random rd = new Random(); // 랜덤 객체 생성

		for (int i = 0; i < array.length; i++) {

			boolean dupliationCheck = true;

			while (dupliationCheck) {

				array[i] = rd.nextInt(20) + 1; // nextInt(20)만 하면 0부터 19까지 난수 발생하니, +1 해준 것 !
				dupliationCheck = false; // false 일 때 while 문 빠져나옴

				// 중복된 난수 체크해주기 !
				for (int j = 0; j < i; j++) {
					if (array[i] == array[j] || array[i] == 21) {
						dupliationCheck = true;
					}
				}
			}
		}
		return array;
	}

	// 10개의 난수 배열을 매개변수로 하여 발생된 난수와 통계정보를 store.txt 파일에 출력
	public static void printStatistics(int[] array) {

//		PrintWriter pw = null;
		BufferedWriter bw = null;

		try {
//			pw = new PrintWriter(new FileWriter("store.txt"));
			bw = new BufferedWriter(new FileWriter("store.txt"));

			// 초기화 : 배열의 첫번째 방의 값으로
			// 초기화를 0으로 하면 min이 0이 되어버림 !
			int max = array[0];
			int min = array[0];
			int sum = array[0];

			for (int i = 0; i < array.length; i++) {

//				pw.println(array[i]);
				bw.write(Integer.toString(array[i]));
				// write() 메소드 안에는 문자형태가 와줘야 함! 그러므로 int를 String으로 형변환 한 것!
				// api 찾아보면 write(int) => int 를 인자로 받는 것이 있는데 그건 4바이트 int가 아니라
				// char 형태의 '한 문자'를 받는 것임 ! ex) "홍" 
				bw.newLine();

				// 최대, 최소 논리야 놀자 할 필요 없이 API 사용 !
				if (i != 0) { // 초기화를 array[0]으로 했으니까 제외 
					max = Math.max(max, array[i]); // array[0], array[1] 비교 
					min = Math.min(min, array[i]); // array[0], array[1] 비교
					sum += array[i]; // array[0] + array[1]
				}

			}

//			pw.println("최대값 : " + max);
//			pw.println("최소값 : " + min);
//			pw.println("평균값 : " + (double) sum / array.length);
//			pw.flush();

			bw.write("최대값 : " + max);
			bw.newLine();
			bw.write("최소값 : " + min);
			bw.newLine();
			bw.write("평균값 : " + (double) sum / array.length);
								// 소수점으로 찍히게 하기 위해 형변환
			bw.newLine();
			bw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	/// main method
	public static void main(String[] args) {
		int[] array = generateRandomNumber();
		printStatistics(array);

	}

}
