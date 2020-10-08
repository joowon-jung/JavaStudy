//1007 과제 첫번째 장 
package g.io.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// 파일 만들고, 내용이 뭐가 있던간에 다 더하고 곱함
// 1. 파일 읽고 -> 2. 더하고, 곱하고 -> 3. 쏜다

public class FileCalculator {

	// String 타입의 텍스트 형식 파일명을 입력받아 텍스트틑의 각 라인에 있는 정수 숫자들의 합과 곱을 계산 후,
	// 해당 파일의 가장 마지막 부분에 합과 곱의 결과를 순서대로 각각의 라인에 추가하여 저장
	// 단, 여기서 모든 숫자는 반드시 정수(소수점이 없는 수) 이어야 함.
	public void addCalculateResult(String inputFileName) throws Exception {
														// throws Exception해서 던져버리고 try - catch 안 해주겠다는 뜻
		
		// ==> 원본파일 Data를 read (받아옴) 할 수 있는 BufferedReader 생성
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
				
		// Data read 한 것을 ArrayList에 담기 위해 선언 ! Vector 써도 상관 x !
		List <Integer> m = new ArrayList<Integer>();
		
		String line = null; // 파일 안의 내용들 
		while ( (line = br.readLine() ) != null ) { // 내용이 끝날 때 까지 
			m.add(Integer.parseInt(line)); // 한 줄씩 readLine() 으로 읽어온 것을 int로 바꿔 arrayList에 저장 
										   // <Integer> 제네릭 인티져인데 어떻게 add()의 인자로 int가 들어감?
										   // ==> 오토박싱 되어서 자동으로 Integer값으로 들어가게 됨!
		}
		br.close(); // BufferedReader 다 썼으니 닫아줌
		
		int sum = 0;
		int multi = 1;
		
//		for (int i = 0; i < m.size(); i++) { // 한 줄씩 ArrayList에 저장한 것을 가져옴
//			sum += m.get(i);
//			multi *= m.get(i);
//		}
		
		// ** enhanced for loop 문 사용하면 편리 ! **
		for (int value : m) { // m.size() 만큼 돌려서 int value에 저장. sum, multi 에 값 넣기		
							  // m.size() 만큼 돌려서 뽑아낸 것이 인티져인데 (<Integer>) 어떻게 int value 에 들어감?
							  // ==> 오토언박싱 되어서 자동으로 int값으로 들어가게 됨!
			sum += value;
			multi *= value;
		}
		// ArrayList에 sum과 multi 추가
		m.add(sum);
		m.add(multi);
		
//		PrintWriter pw = new PrintWriter(new FileOutputStream(inputFileName, true));
//		// 원래 내용에다가 계속 추가
//		
//		pw.println("\n" + sum);
//		pw.println(multi);
//		
//		pw.flush();
//		pw.close();
		
		BufferedWriter bw = new BufferedWriter (new FileWriter(inputFileName));
		
		for (int value : m) {
			bw.write(value + ""); // write() 안에 인자로 String 넣어줘야 하는데 value가 int니까 "" 붙여줌!
								  // "" => 널 스트링
			bw.newLine(); //개행 하기 위함
		}
		
		bw.flush();
		bw.close();
		
		System.out.println("정상 실행!");
	}
	
	///main method
	public static void main(String[] args) throws Exception {
										// throws Exception해서 예외처리 안 해주겠다는 뜻
		FileCalculator fc = new FileCalculator();
		fc.addCalculateResult("test.txt");
		// 절대경로 사용할 경우, '\'는 키워드니까 \\ 두번 써주기!
	}
}
