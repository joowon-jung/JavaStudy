// 1006 과제 첫번째 장
package g.io.ex01;
import java.io.*;
/*
 * 	파일을 하나 만들고, 파일 내용을 읽고, 파일 내용을 출력
 *  거꾸로 문자열 조작 => 읽어서 어디에 담고 출력해야 할 듯 ?
 */
public class FileController {

	///main method
	public static void main(String[] args) throws Exception {
		FileController c = new FileController();
		String oldf = "/Users/jungjoowon/eclipse-workspace/JavaStudy/src/g/io/ex01/oldf.txt";
		String newf = "/Users/jungjoowon/eclipse-workspace/JavaStudy/src/g/io/ex01/newf.txt";
		c.reverseLine(oldf, newf);
	}
	
	// String 타입의 텍스트 형식 파일명을 입력받아 텍스트의 라인 순서를 반대로 하여
	// 두 번째 인자인 출력할 String 타입의 텍스트 파일명으로 저장
	// 즉. 입력라인의 첫번째 라인은 출력라인의 제일 마지막 라인이 됨 !
	public void reverseLine(String inputFileName, String outputFileName) throws Exception {
		
		// ==> 원본파일 Data를 read (받아옴) 할 수 있는 BufferedReader 생성
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		
		// ==> Data를 write (내보냄) 할 수 있는 BufferedWriter 생성
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
		
		// read / writer 하는 while 문
		String source = null; // source : 파일 안의 내용들.
		while ( ( source = br.readLine()) != null ) { 
			bw.write(source + '\n'); // 개행해서 출력해주기 위함
			//bw.newLine(); 
		}
		bw.flush();
		
		br.close();
		bw.close();
		System.out.println("정상 실행!");
	}
}
