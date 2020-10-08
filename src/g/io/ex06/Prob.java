// 1006 과제 세번째 장 
package g.io.ex06;

import java.util.Vector;
// 여러번 파싱! 합! 
// 하나의 정보를 추상화&캡슐화 한 Score.class

public class Prob {

	public static void main(String[] args) {
		Prob p2 = new Prob();
		Vector scores = p2.getScore("data.txt");
		for (int i = 0; i < scores.size(); i++) {
			Score score = (Score) scores.get(i);
			System.out.println(score.getName() + " : "
									+ score.getKor()+" "+score.getEng()+" "
									+ score.getMath()+" "+score.getSum() );
			
		}
	}
	public Vector getScore(String fileName) {
		return null;
	}
}

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
