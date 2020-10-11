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
			array[i] = (int) rd.nextInt(20) + 1;
		}

		return array;
	}

	// 10개의 난수 배열을 매개변수로 하여 발생된 난수와 통계정보를 store.txt 파일에 출력
	public static void printStatistics(int[] array) {

		PrintWriter pw = null;

		try {
			new PrintWriter(new FileWriter("store.txt");
			
			int max = 0;
			int min = 0;
			int sum = 0;

			for (int value : array) {
				sum += value; 
				pw.println(value + "\n"); 
			}
			
			pw.println("최대값 : " + (double) sum / array.length);
			
			for (int i = 0; i < array.length; i++) {
				for (int j = 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						max = array[i];
					} else if (array[i] < array[j]) {
						min = array[i];
					}
				}
			}
			
			pw.println("최값 : " + (double) sum / array.length);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null) {
					pw.close(); // 다 썼으니 닫아줌 
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/// main method
	public static void main(String[] args) {
		int[] array = generateRandomNumber();

		printStatistics(array);

	}

}
