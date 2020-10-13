package g.io.ex09;

import java.util.List;
import java.util.Vector;

public class Prob {

	public static void main(String[] args) throws Exception {
		
		// 고객 (유저) 정보를 갖는 FileName 선언
		String pathName = "data2.txt";
						// 절대경로로 '\' 사용해도 됨! but '\'는 키워드니까 \\ 두번 써 주기. / 쓸땐 한개 써도 상관없음
		
		// data.txt 내용 출력
		FileUtil.fileToPrint(pathName);
		
		System.out.println("==================");
		// data.txt 내용 중 서울 거주자 검색, 결과를 담은 Vector 인스턴스 받기
		System.out.println("파일 내용중 서울 정보 검색");
		List <User> vector = FileUtil.fileFindAddres(pathName, "서울"); // List로 유연하게 받아오기 
	
//		for (int i = 0; i < vector.size(); i++) {
//			System.out.println(vector.get(i));
//		}
		
		for (User value : vector) {
			System.out.println(value);
		}

		System.out.println("==================");
		// data.txt 내용 중 경주 거주자 검색, 결과를 담은 Vector 인스턴스 받기
		System.out.println("파일 내용중 경주 정보 검색");
		vector = FileUtil.fileFindAddres(pathName, "경주");
		for (int i = 0; i < vector.size(); i++ ) {
			System.out.println(vector.get(i));
		}
		
		System.out.println("==================");
		// data.txt 내용 중 경 거주자 검색, 결과를 담은 Vector 인스천스 받기
		System.out.println("파일 내용중 경기도 정보 검색");
		vector = FileUtil.fileFindAddres(pathName, "경기도");
		for (int i = 0; i < vector.size(); i++ ) {
			System.out.println(vector.get(i));
		}
	}

}
