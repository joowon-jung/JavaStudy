//bMethod09.jpg

/*
중간값 찾기 논리야 놀자 연습
배열 소팅해서 홀수라면 -> 중간값이 평균값
           짝수라면 -> 중간값 2개 비교

유틸리티성 Beans이 모여있는 java.util
java.util.Arrays : Array를 쉽게 다룰 수 있도록 추상화&캡슐화된 빈들
=> api 찾아서 보기

, , , , 찍고 마지막에 , 없이 출력하려면 if문이나 삼항연산자를 이용했는데
Arrays.toString() 을 사용하면 저절로 해준다!
어떤 의미를 갖는지 api 찾아보기 !
*/

package b.method.ex09;

import java.util.Arrays;

public class Median {
	
	
	int median; 
	
	public int findMedian(int[] values) {

		// 배열 index가 짝수 일 때
		if (values.length % 2 == 0) {

			for (int i = 0; i < values.length; i++) {
				for (int j = 1; j < values.length; j++) {

					if (values[i] < values[j]) {
						int temp = values[i];
						values[i] = values[j];
						values[j] = temp;
					}
				}
				if (values[(values.length / 2)] < values[(values.length / 2) + 1]) {
					median = values[(values.length / 2)];
				} else {
					median = values[(values.length / 2) + 1];
				}
			}
			return median;
		} 
		// 배열 index가 홀수 일 때
		else {
			for (int i = 0; i < values.length; i++) {
				for (int j = 1; j < values.length; j++) {

					if (values[i] < values[j]) {
						int temp = values[i];
						values[i] = values[j];
						values[j] = temp;
					}
				}
				median = values[(values.length / 2) + 1];
			}
			return median;
		}
	}
	
	public static void main(String[] args) {
		
		Median median = new Median();
		
		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : " + Arrays.toString(values1));
		System.out.println("median : " + median.findMedian(values1));
		System.out.println("================================================");
		
		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : " + Arrays.toString(values2));
		System.out.println("median : " + median.findMedian(values2));
	}
	

}
