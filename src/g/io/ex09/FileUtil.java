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
		
		BufferedReader br  = new BufferedReader(new FileReader(fileName));
		
		String source = ""; // source : 파일 안의 내용들.

		while ((source = br.readLine()) != null) {
			System.out.println(source);
		}
		br.close();
	}
	
	// 전달 받은 문자열에 해당하는 파일의 내용 중 전달받은 문자열 address에 해당하는 지역 정보를 갖는 고객 정보를 읽고,
	// 읽은 정보를 내용을 이용 User 인스턴스 생성 후 Vector에 저장 return 한다 
	public static List <User> fileFindAddres(String fileName, String address) throws Exception {
		
		BufferedReader br  = new BufferedReader(new FileReader(fileName));
		List <User> vector = new Vector <User>();
		
		String source = "";
		while ((source = br.readLine()) != null) {
			
			String[] data = source.split("/");
			
			if (data[1].equals(address)) {
				
				boolean gender = false;
				
				if (data[3].equals("남")) {
					gender = true;
				} else if (data[3].equals("여")) {
					gender = false;
				} 
				
				User user = new User(data[0], data[1], data[2], gender);
				vector.add(user);
			}
		}
	
		return vector;
	}

}
