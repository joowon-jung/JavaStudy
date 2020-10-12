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
