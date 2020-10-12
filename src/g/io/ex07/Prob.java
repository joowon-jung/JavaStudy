//gio07.jpg
package g.io.ex07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
// I/O 이해, 파싱, 대소문자 구별
// 돌아가게 해 놓고 enhanced for loop 사용해보기!
// 메소드 시그니쳐 구체적으로 Vector 쓰지말고, List로 인터페이스 프로그래밍 해보기

// list.txt 파일의 내용을 읽어서 주어진 조건대로 "수료"인지 "미수료"인지 출력
public class Prob {

	// 과목별 수료기준을 판단하여 Vector에 저장한 후에 반환하는 getList() 메소드 
	public List getList() {

		BufferedReader br = null;
		List vector = new Vector();
		
		try {
			// ==> 원본파일 Data를 read (받아옴) 할 수 있는 BufferedReader
			br = new BufferedReader(new FileReader("list.txt"));
			
			String line = ""; // 널 스트링으로 초기화
			while ((line = br.readLine()) != null) { // 내용이 끝날 때 까지

				String[] data = line.split("/"); // "/" 기준으로 문자열 파싱
				
//				vector.add(data[0]); // 이름
//				vector.add(data[1]); // 과목
//				vector.add(data[2]); // 점수 
				
				// 레퍼런스 값 상태비교 => 무조건 equals() 사용해주기!
				// 자바는 대소문자를 구별하는데, 소문자 java이던 대문자 JAVA이던 똑같은 java로 인식하려면
				// equalsIgnoreCase 메소드 사용 ! => API 싸움 
				if ( ( data[1].equalsIgnoreCase("java") )&& ( Integer.parseInt(data[2]) >= 80 ) ) {
					vector.add("["+data[0]+", "+data[1]+", "+data[2]+", 수료]");
				} else if ( ( data[1].equalsIgnoreCase("sql") )&& ( Integer.parseInt(data[2]) >= 90 ) ) {
					vector.add("["+data[0]+", "+data[1]+", "+data[2]+", 수료]");
				} else {
					vector.add("["+data[0]+", "+data[1]+", "+data[2]+", 미수료]");
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return vector;
	}

	/// main method
	public static void main(String[] args) {
		Prob e = new Prob();
		List scores = e.getList();
		
//		for (int i = 0; i < scores.size(); i++) {
//			System.out.println(scores.get(i));
//		}
		
		//enhanced for loop - 제네릭 사용 안했으니까 Object로 받음 
		for (Object i : scores) {
			System.out.println(i); 
		}
	}

}
