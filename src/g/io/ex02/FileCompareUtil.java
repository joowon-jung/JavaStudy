// 1006 과제 두번째 장 
package g.io.ex02;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
// 파일 두개 만들기 !
// 첫번째 두번째 파일내용 비교해서 똑같지 않은 것을 ArrayList에 담아서 출력 -> I/O 사용

public class FileCompareUtil {

	// String 타입의 텍스트 형식 파일명 2개를 입력받아 두 텍스트 파일의 내용을 라인별로 비교하고
	// 차이점이 있는 경우, 해당 라인들을 ArrayList에 담아 리턴
	
	// - 두 텍스트 파일의 전체 라인수는 동일하다라고 간주
	// - 첫번째 입력된 텍스트 파일 내용을 기준으로 두번째 입력된 텍스트 파일 내용을 라인별로 비교하고
	// 동일할 경우 다음 라인으로 이동
	// 다를 경우에는 해당 라인의 번호와 함께 두번째 파일의 해당 라인 내용을 결과 용도의 ArrayList에 추가
	public List compareFile(String fstFileName, String scdFileName) throws Exception {
		
//		FileReader fr = new FileReader(fstFileName); // 텍스트 파일을 읽어들일 때 사용하는 문자 기반 스트림
//													 // read() 사용해서 한 문자씩 읽음 => 효율성 떨어짐 
//		BufferedReader br = new BufferedReader(fr); // 문자 입력 스트림에 연결되어 버퍼를 제공해주는 스트림
//													// readLine() 사용해서 한 줄씩 읽음
													// 무조건 뭘 거쳐서 수행해야 하기 때문에 filter stream 
		BufferedReader fstBr = new BufferedReader(new FileReader(fstFileName)); // 첫번째 파일내용 읽음 
		BufferedReader scdBr = new BufferedReader(new FileReader(scdFileName)); // 두번째 파일내용 읽음 
		
		String fstLine = fstBr.readLine(); // fstLine : 일단 첫번째 파일 첫번째 줄 읽어온 것으로 초기화 
		String scdLine = scdBr.readLine(); // scdLine : 일단 두번째 파일 첫번째 줄 읽어온 것으로 초기화 
		
		int lineNum = 0;
		
		// 파일 내용 비교해서 다르면 출력해줄 내용을 저장할 ArrayList
		List <String> resultList = new ArrayList<String> ();
		//ArrayList <String> resultList = new ArrayList<String> ();
		//ArrayList로 구체적으로 받으면 Vector로 바뀔 시 다 바꿔줘야 한다.
		//List를 사용해서 해보기! (인터페이스 활용 프로그래밍)
		
		while (fstLine != null) { // 읽어들일 줄이 없을 때 까지
			
			lineNum++;
			if (!fstLine.equals(scdLine)) { // 첫번째 파일 & 두번째 파일 각각의 줄 비교했을 때 다르면 
				// 레퍼런스 타입 비교 => 무조건 equals 이용!
				resultList.add("LINE " + lineNum + ":" + scdLine); // 출력
			}
			
			fstLine = fstBr.readLine(); // 첫번째 파일 그 다음 줄 한줄 읽음
			scdLine = scdBr.readLine(); // 두번째 파일 그 다음 줄 한줄 읽음
		}
		
		return resultList;
	}
	
	public static void main(String[] args) throws Exception {
		FileCompareUtil util = new FileCompareUtil();
		System.out.println(util.compareFile("fstFile.txt", "scdFile.txt"));
							// SOP 안에 레퍼런스 타입을 찍으면 toString()이 생략된 구조
							// ArrayList 안에서 오버라이딩 된 toString()이 호출됨
		System.out.println("성공!");
	}

}
