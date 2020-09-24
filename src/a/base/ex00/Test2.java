//scan0010.jpg

package a.base.ex00;

public class Test2 {
	public static void main(String[] args) {

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		if (i > j) {

			System.out.println("첫번째 인수:" + i + ", 두번째 인수: " + j + "," + i + "-" + j + "=" + (i - j));

		} else {

			System.out.println("첫번째 인수:" + i + ", 두번째 인수: " + j + "," + j + "+" + i + "=" + (i + j));

		}

	}

}