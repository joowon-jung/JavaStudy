//fException03_1.jpg 
package f.exception.ex03;

import java.util.List;
import java.util.Vector;

public class Prob {

	/// main method
	public static void main(String[] args) {

		// 메서드 시그니쳐를 구체적인 Vector로 하지 않고 List로 인터페이스 프로그래밍 
		List <Book> bookList = new Vector <Book> (); 
		// 제네릭 사용 => 묵시적 & 명시적 형변환 안 해도 됨 ! 

		try {
			
			bookList.add(makeBook("Java Programming 기초 : 컴퓨터 : 35000"));
			bookList.add(makeBook("초보자를 위한 SQL : 컴퓨터 : 28000"));
			bookList.add(makeBook("HTML5 API 소개 : 컴퓨터 : 58000"));
			// Case 1
			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터 : 45000"));
			// Case 2
			//bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터"));
			// ==> 데이터 값을 두개밖에 안 넣음. 3개의 데이터가 와야 하는데 두개밖에 오지 않았으니까 예외처리!
			// 내가 원하는 데이터 포맷이 잘못된 것이니까 '사용자 정의 예외처리' DataFormatException 발생 
			bookList.add(makeBook("JSP Programming 고급 : 컴퓨터 : 56000"));
			
			System.out.println("<< 책 목록 >>");
			printBookList(bookList);
			
		} catch (DataFormatException e) {
			System.out.println(e.getMessage());
			// 사용자 예외 만들 때 인자를 받는 생성자 만들고, 발생시킬 때 인자를 넣어줬기 때문에 
			// DataFormatException 타고 RuntimeException 타고 throwable 가보면 거기서 어떻게 출력됐는지 알 수 있음 
		}
	}

	// 매개변수로 받은 문자열을 적절하게 이용하여 Book 객체를 생성하여 리턴하는 메소드 
	private static Book makeBook(String bookData) { 
								// bookData : 한 권의 책 정보가 저장되어있는 문자열
		
		// 매개변수로 받은 문자열 파싱 
		String[] bookInfo = bookData.split(" : ");
		Book book = new Book();
		
		if (bookInfo.length == 3) {
	
			String title = bookInfo[0];
			String kind = bookInfo[1];
			int rentalPrice = Integer.parseInt(bookInfo[2]);
			
			book.setTitle(title);
			book.setKind(kind);
			book.setRentalPrice(rentalPrice);
			
		} else {
			// throws 로 던지지 않았으니, 예외처리 안 해줘도 되는 RuntimeException을 상속받아서 사용자 정의 Exception 만들면 됨!
			//                                     (unchecked) 
			throw new DataFormatException(bookInfo[0] + "책 정보는 변환할 수 없는 데이터 포맷입니다.");
		}

		return book;
	}

	// 매개변수로 받은 Vector에 Book 목록을 출력하는 메소드 
	private static void printBookList(List <Book> bookList) {
								// bookList : Book 객체 여러개가 저장된 Vector
		
//		for (int i = 0; i < bookList.size(); i++) {
//			Book book = bookList.get(i);
//			System.out.println(book);
//		}
		
		for (Book value : bookList) {
			System.out.println(value);
			//System.out.println(value.toString());
		}
	}
}
