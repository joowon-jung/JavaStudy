//eApi04.jpg

// ★★★★ 중요 ★★★★
// 전달메세지로는 어레이가 들어오고, 
// 리턴 메세지로는 벡터 스트링 제네릭임.
// 어레이가 들어가면 벡터 안에 거꾸로 들어감

package e.api.ex04;

import java.util.Vector;

public class ArrayCopy {

	// 스트링 배열에 있는 데이터를 Vector로 변환하는 프로그램
	public Vector<String> moreToVector(String[] datas) {
		
		Vector <String> vector = new Vector <String> ();
		
		for (int i = datas.length-1; i >= 0; i--) {
			vector.add(datas[i]);
		}
		
		//System.out.println(vector.toString());
		return vector;
	}

	public static void main(String[] args) {
		
		ArrayCopy ac = new ArrayCopy();
		String datas[] = { "1", "2", "3", "4", "5" };
		System.out.println(ac.moreToVector(datas));
		System.out.println(ac.moreToVector(datas).toString());
		// => 자바에서 SOP 안에 클래스 Reference 를 찍으면 .toString() 이 생략된 구조이다!
		// 그러므로 벡터 스트링 제네릭을 리턴받고 for 문을 쓰지 않아도 출력이 되는 것 !
		// 쓰레기 값이 나오지 않았으니 Vector.class 안에서 
		// Object.class 의 toString 메소드가 오버라이딩 된 구조이다
		// 오버라이딩 하면 하위 클래스의 오버라이딩 된 메소드부터 접근한다 ★
		
	}
}