//cModeling04.jpg

package c.modeling.ex04;

public class BookMgr { // <개념적> 

	///Field
	Book[] booklist; //책 객체 여러개를 저장할 수 있는 책 목록 배열
	// BookMgr has-a Book < Association 관계 > 
	
	///Constructor
	public BookMgr() {
	}
	
	//책 목록(booklist) 이라는 배열 변수를 초기화하는 생성자
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	///Method
	
	//책 목록을 화면에 출력하는 메서드
	public void printBookList() {
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	//모든 책 가격의 합을 출력하는 매서드
	public void printTotalPrice() {
		
		int sum = 0;
		
		for (int i = 0; i < booklist.length; i++) {
			sum += booklist[i].getPrice();
		}
		
		System.out.println("전체 책 가격의 합 : " + sum);
	}
}
