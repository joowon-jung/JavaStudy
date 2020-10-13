package g.io.ex10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// 키보드로부터 학번, 국어, 영어, 수학, 자바 성적을 입력 받아서 총점, 평균 및 학점을 구하고
// 이런 정보를 성적표 형식으로 grade.txt 파일에 기록

public class prob {

	///static method
	// 평균에 따라서 학점 구하는 메소드 
	public static char checkGrade(double avg) {

		switch ((int) avg / 10) {
		case 9:
		case 10:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';
		}
	}
	
	///main method
	public static void main(String[] args) {
		
		String stdNum = "";
		int kor = 0;
		int math = 0;
		int eng = 0;
		int java = 0;
		int sum = 0;
		double avg = 0;
		
		// 스캐너 클래스 안에 키보드를 준 것 !
		Scanner keyboard = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String abc = br.readLine();
		// 이렇게 해도 되는데 스캐너를 쓰는 이유 : 위처럼 하면 readLine() 에서 String만 받을 수 있지만
		// Scanner를 사용하면 nextInt, nextDouble 등 다양한 메소드들을 받을 수 있기 때문에!
		
		// Scanner : Real World에 스캔이라는 것을 추상화 & 표준화 한 객체 
		
		System.out.print("학번을 입력하세요 : ");
		stdNum = keyboard.nextLine();
		System.out.print("국어 성적을 입력하세요 : ");
		kor = keyboard.nextInt();
		System.out.print("수학 성적을 입력하세요 : ");
		math = keyboard.nextInt();
		System.out.print("영어 성적을 입력하세요 : ");
		eng = keyboard.nextInt();
		System.out.print("자바 성적을 입력하세요 : ");
		java = keyboard.nextInt();
		
		keyboard.close();
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("grade.txt"));
			
			// PrintWriter 써도 됨! PrintWriter은 
			// PrintWriter out = new PrintWriter("grade.txt"); 라고 쓸 수 있음.
			// ()안에 파일 stream 이 없는데 어떻게? ex) new FileWriter이런게 없는데 어떻게?
			// PrintWriter 에서는 생성자에 파일이름만 넣어줘도 필요한 중간 OutputStreamWriter를 작성해 줘서 
			// 자동 생성된 것에 의해서 문자를 읽어 오는 것 !
			
			sum = kor + math + eng + java;
			avg = sum / (double) 4;
			
			bw.write("----------------\n");
			bw.write("학번 : " + stdNum);
			bw.write("\n----------------\n");
			bw.write("국어 : " + Integer.toString(kor));
			bw.newLine();
			bw.write("수학 : " + Integer.toString(math));
			bw.newLine();
			bw.write("영어 : " + Integer.toString(eng));
			bw.newLine();
			bw.write("자바 : " + Integer.toString(java));
			bw.write("\n----------------\n");
			bw.write("총점 : " + sum);
			bw.newLine();
			bw.write("평균 : " + avg);
			bw.newLine();
			bw.write("학점 : " + checkGrade(avg));
			bw.write("\n----------------\n");
		
			bw.flush();
			
			System.out.println("파일을 출력합니다 .");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
