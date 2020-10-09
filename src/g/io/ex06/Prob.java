// 1007 과제 세번째 장 
package g.io.ex06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
// 여러번 파싱! 합! 
// 하나의 정보를 추상화&캡슐화 한 Score.class

public class Prob {

	public static void main(String[] args) {
		Prob p2 = new Prob();
		List scores = p2.getScore("data.txt");
		
		// 제네릭 사용해서 했으면 명시적 형변환 안 해줘도 됐음 !
		for (int i = 0; i < scores.size(); i++) {
			Score score = (Score) scores.get(i); // 지금 scores안에 들어가있는 타입들이 Object 니까 Score 타입으로 명시적 형변환!
			System.out.println(score.getName() + " : " + score.getKor() + " " + score.getEng() + " " + score.getMath()
					+ " " + score.getSum());
		}
		
//		for (Object value : scores) {
//			Score score = (Score) value;
//			System.out.println(score.getName() + " : " + score.getKor() + " " + score.getEng() + " " + score.getMath()
//			+ " " + score.getSum());
//		}
	}

	// 1) 주어진 data.txt 파일의 데이터를 읽어들인 후,
	// 2) 각 학생의 데이터를 Score 객체로 표현하여
	// 3) 모든 학생의 데이터를 Vector 형으로 반환하는 getScore 메서드
	public List getScore(String fileName) {

		// ==> 원본파일 Data를 read (받아옴) 할 수 있는 BufferedReader
		BufferedReader br = null;

		List vector = new Vector(); // 데이터를 Vector 형으로 받기 위해서 생성
									// List로 바꿔서 유연하게 인터페이스 프로그래밍 한 것 
		// 제네릭 사용해서 List <Score> vector  = new <Score> Vector(); 해도 됨 ! Score 데이터타입만 넣으니까

		try {
			br = new BufferedReader(new FileReader(fileName));

			String line = ""; // 널 스트링으로 초기화
			while ((line = br.readLine()) != null) { // 내용이 끝날 때 까지

				String[] data = line.split("/"); // "/" 기준으로 문자열 파싱

				String name = data[0];
				int kor = Integer.parseInt(data[1]);
				int eng = Integer.parseInt(data[2]);
				int math = Integer.parseInt(data[3]);
				int sum = kor + eng + math;

				Score score = new Score(name, kor, eng, math, sum);
				vector.add(score);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null) { 	// 이거 안 해주면 NullPointerException 날 수도 있음
									// br 에 null이 들어가있는 채로 null.close() 하게 되니까!
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return vector;
	}
}

// 학생의 이름과 성적을 저장하기 위한 클래스
// 학생이 많아질수록 다뤄야 할 데이터가 기하급수적으로 늘어남!
// 그러므로 데이터를 저장하기 위한 Score 클래스 사용하는 것 
class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;

	public Score(String name, int kor, int eng, int math, int sum) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}
