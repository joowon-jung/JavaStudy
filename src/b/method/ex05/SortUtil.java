//bMethod05.jpg

package b.method.ex05;
//Sorting 하는 것을 메인에 두지 않고 메소드로 만들면
//인스턴스 생성만 하고 나중에 언제든지 호출해서 쓸 수 있다

public class SortUtil { //오름차순 Sorting Method
	
	public int[] ascending(int[] inputNumbers) {
		
		for(int i = 0; i < inputNumbers.length; i++) {
			for (int j = i+1; j < inputNumbers.length; j++) {
				
				int temp01 = inputNumbers[i];
				int temp02 = inputNumbers[j];
				
				if (inputNumbers[i] > inputNumbers[j]) {
					inputNumbers[i] = temp02;
					inputNumbers[j] = temp01;
				}
			}
		}
		
		return inputNumbers;
	}
	
	public static void main(String[] args) {
		
		SortUtil util = new SortUtil();
		int[] numbers = new int[] { 7, 5, 2, 19, 34, 51, 32, 11, 67, 21 };
		
		numbers = util.ascending(numbers);
		
		//배열 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			
			if (i != numbers.length-1) {
				System.out.print(" , "); //, 으로 구분
			} else { //맨 마지막에는 , 를 넣지 않음
				System.out.println(" ");
			}
		}
		System.out.println("Successfull!!");
	}
}
