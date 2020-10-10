//gio07.jpg
package g.io.ex07;

import java.util.Vector;

public class Prob {

	public Vector getList() {
		
		return null;
	}
	
	///main method
	public static void main(String[] args) {
		Prob e = new Prob();
		Vector scores = e.getList();
		for (int i = 0; i < scores.size(); i++) {
			System.out.println(scores.get(i));
		}
	}

}
