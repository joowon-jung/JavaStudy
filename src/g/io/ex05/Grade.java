//1007 과제 두번째 장 
package g.io.ex05;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

// 총점을 알려면 readLine()에서 파싱해서 숫자, 숫자 자르고! 
// 합하고! readCount 해서 평균까지 나와야 함!
public class Grade {

	// String 타입의 텍스트 형식 파일명을 입력받아, 파일에 있는 내용의 총점과 평균을 출력
	public void printGrade(String fileName) {

		// ==> 원본파일 Data를 read (받아옴) 할 수 있는 BufferedReader 선언
		BufferedReader br = null; // 레퍼런스 값 null로 초기화

		// FileCalculator에서는 throws Exception 해서 메소드에서도 예외 던지고, main에서도 던졌는데
		// 여기서는 try - catch 해서 예외 잡아줬음! checked Exception이라 안 잡아주면 안 됨 (던지던지, 잡던지)
		try {
			// ==> 원본파일 Data를 read (받아옴) 할 수 있는 BufferedReader 생성
			br = new BufferedReader(new FileReader(fileName));

			String source = null; // source : 파일 안의 내용들.
			int sum = 0;
			int readCount = 0;

			while ((source = br.readLine()) != null) {
				String[] temp = source.split(",");
				System.out.println(temp[0] + "의 점수는 " + temp[1] + " 점 입니다.");
				sum += Integer.parseInt(temp[1]);
				readCount++;
			}

			System.out.println("모두의 총점은 " + sum + " 점 입니다.");
			System.out.println("모두의 평균은 " + sum / readCount + " 점 입니다.");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (br != null) { // br이 null인지 확인해주기 위함. null.close()하면 오류나니까!
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("정상 실행!");
		}
	}

	/// main method
	public static void main(String[] args) {
		Grade grade = new Grade();
		String fileName = "score.txt";
		// 그냥 score니까 자바 프로젝트 밑에 이 파일이 있어야 함!
		grade.printGrade(fileName);
	}
}