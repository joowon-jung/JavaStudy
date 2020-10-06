// 1006 과제 첫번째 장
package g.io.ex01;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/*
 * 	파일을 하나 만들고, 파일 내용을 읽고, 파일 내용을 출력
 *  거꾸로 문자열 조작 => 파일내용을 읽어서 어디에 담고 출력해야 할 듯 ? 
 *  => ArrayList에 담았음 ! List를 이용하여 Vector, ArrayList 사용하면 편리 (다형성)
 */
public class FileController {

	///main method
	public static void main(String[] args) throws Exception { // try - catch 안 하고 그냥 던짐!
		FileController c = new FileController();
		String oldf = "oldf.txt";
		             // /Users/jungjoowon/eclipse-workspace/JavaStudy/src/g/io/ex01/oldf.txt => 절대경로
					 // 이클립스는 default가 자바 프로젝트 안이니까 oldf.txt만 하면 자바 프로젝트 안의 파일이라는 뜻!
		String newf = "newf.txt";
		c.reverseLine(oldf, newf);
	}
	
	// String 타입의 텍스트 형식 파일명을 입력받아 텍스트의 라인 순서를 '반대로' 하여
	// 두 번째 인자인 출력할 String 타입의 텍스트 파일명으로 저장
	// 즉. 입력라인의 첫번째 라인은 출력라인의 제일 마지막 라인이 됨 !
	public void reverseLine(String inputFileName, String outputFileName) throws Exception {
		
		// ==> 원본파일 Data를 read (받아옴) 할 수 있는 BufferedReader 생성
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		
		// Data read 한 것을 ArrayList에 담기 위해 선언 !
		List <String> m = new ArrayList<String>(); // Vector 써도 상관 x !
		// ArrayList <String> m = new ArrayList<String>();
		
		String line = null; // 파일 안의 내용들 
		while ( (line = br.readLine() ) != null ) { // 내용이 끝날 때 까지 
			m.add(line); // 한 줄씩 ArrayList에 저장 
		}
		br.close(); // BufferedReader 다 썼으니 닫아줌
		
//		FileOutputStream fos = new FileOutputStream(outputFileName);
//		PrintWriter pw = new PrintWriter(fos);
		PrintWriter pw = new PrintWriter(new FileOutputStream(outputFileName));
		for (int i = m.size()-1; i >= 0; i--) { // 한 줄씩 ArrayList에 저장한 것을 거꾸로 가져옴 
			pw.println(m.get(i));
		}
		pw.flush();
		pw.close();
		
		// *** PrintWriter vs BufferedWriter ***
		// 자바에서 파일에다가 출력을 할 때 PrintWriter, BufferedWriter을 이용할 수 있음
		// - PrintWriter : print, println 등 다양한 출력함수를 제공함으로써 파일 출력 편함
		// - BufferedWriter : 버퍼를 사용하여 속도 향상! 
		// ( 메모리 버퍼에 데이터를 보내고, 데이터가 쌓이기를 기다렸다가 한꺼번에 출력 )
		// 둘 중 하나를 잘 선택해서 사용하면 되는데 이 문제의 경우에는 for문을 사용해서 거꾸로 출력해야 하니까
		// PrintWriter을 선택하여 쓰는 것 ! 각각의 장점 활용하여 선택 사용하기
		
//		// ==> Data를 write (내보냄) 할 수 있는 BufferedWriter 생성
//		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
//		
//		// read / writer 하는 while 문
//		String source = null; // source : 파일 안의 내용들.
//		while ( ( source = br.readLine()) != null ) { 
//			bw.write(source + '\n'); // 개행해서 한 줄씩 출력해주기 위함
//			//bw.newLine(); 
//		}
//		bw.flush();
//		
//		br.close();
//		bw.close();
		
		System.out.println("정상 실행!");
	}
}
