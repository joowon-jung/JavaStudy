//eApi04.jpg 미완성!!!!!

// 중요 ★
// 전달메세지로는 어레이가 들어오고, 
// 리턴 메세지로는 벡터 스트링 제네릭임.
// 어레이가 들어가면 벡터 안에 거꾸로 들어감

package e.api.ex04;

import java.util.Vector;

public class ArrayCopy {

	// 스트링 배열에 있는 데이터를 Vector로 변환하는 프로그램
	public Vector<String> moreToVector(String[] datas) {
		
		Vector <String> vector = new Vector <String> (datas.length);
		
		for (int i = 0; i < datas.length; i++) {
			for (int j = datas.length; j <= 0; j--) {
				vector.add(datas[i]);
			}
		}
		
		return vector;
	}

	public static void main(String[] args) {
		ArrayCopy ac = new ArrayCopy();
		String datas[] = { "1", "2", "3", "4", "5" };
		System.out.println(ac.moreToVector(datas));
	}
}