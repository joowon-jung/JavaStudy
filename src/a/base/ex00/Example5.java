//scan0208.jpg

package a.base.ex00;

public class Example5 {

	public static void main(String[] args) {
		//문자열 8개를 담을 수 있는 String array 선언
		String[][] text = new String[9][9];

		for (int i = 0; i < text.length; i++) {

			System.out.println((i + 1) + " 단을 출력합니다.");

			for (int k = 0; k < text[i].length; k++) {

//				int multi = (i + 1) * (k + 1);
//				text[i][k] = "text[" + i + "][" + k + "] : " + (i + 1) + "*" + (k + 1) + "=" + multi;
//				System.out.println(text[i][k]);
				
				text[i][k] = (i + 1) + "*" + (k + 1) + "=" + (i+1)*(k+1);
				System.out.println("text["+i+"]["+k+"] : "+text[i][k]);
			}
		}
	}
}