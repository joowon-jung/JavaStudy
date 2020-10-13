package g.io.ex09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Vector;

public class FileUtil {

	// 전달 받은 문자열에 해당하는 파일의 내용을 화면에 출력
	public static void fileToPrint(String fileName) throws Exception {
		// static 메소드 -> 클래스 명으로 접근 가능        throws : try - catch 안 해주고 그냥 던짐 
		
		BufferedReader br  = new BufferedReader(new FileReader(fileName));
		
		String source = ""; // source : 파일 안의 내용들.

		while ((source = br.readLine()) != null) {
			System.out.println(":: "+source);
		}
		br.close();
	}
	
	// 전달 받은 문자열에 해당하는 파일의 내용 중 전달받은 문자열 address에 해당하는 지역 정보를 갖는 고객 정보를 읽고,
	// 읽은 정보를 내용을 이용 User 인스턴스 생성 후 Vector에 저장 return 한다 
	public static List <User> fileFindAddres(String fileName, String address) throws Exception {
				  // List로 유연하게 인터페이스 프로그래밍 => 메소드 안의 행위를 인터페이스를 사용함으로써 캡슐화 할 수 있음
				  //								  (안에서 어떤 짓을 했는지 알 필요가 없음. list로 받아오기만 하면되니까)
		
		BufferedReader br  = new BufferedReader(new FileReader(fileName));
		List <User> vector = new Vector <User>();
		
		if (address.trim().length() == 0) { // trim() : 스페이스바 잘라내주는 메소드
			return vector;
		}
		
		String source = "";
		while ((source = br.readLine()) != null) {
			
			if (source.indexOf(address) != -1) { // ex) '서울'이 있으면 indexOf가 정상적인 숫자를 리턴할 것.
												 // -1 이 나왔다는 건 찾는 인덱스가 없단 얘기 !
				String [] str = source.split("/");
				
				boolean male = true;
				if (str[3].equals("여")) {
					male = false;
				}
				
//				User user = new User(str[0], str[1], str[2], male);
//				vector.add(user);
				vector.add(new User(str[0], str[1], str[2], male));
			}
		}
	
		return vector;
	}

}
