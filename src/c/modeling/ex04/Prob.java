//cModeling04.jpg

/*
[객체지향] Object Modeling
물리적인 - Book
개념적인 - BookMgr
북 인스턴스가 많으니까 한꺼번에 배열로 관리
*/
package c.modeling.ex04;

public class Prob {

	public static void main(String[] args) {
		
		Book[] booklist = new Book[5]; // 객체 Array
		
		/*
		생성자로 상태값 세팅해도 되고 setter 메소드로 상태값 세팅해도 됨
		초기화 방법은 둘 다 됨!! 확인하고 알아서 판단해서 하기!
		하지만 상태값이 아직 결정이 안 됐을 경우는 
		생성자만 () 하고 나중에 세터로 세팅하고
		상태값 알고있으면 걍 생성자로 해주는게 빠름
		*/
		
		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		BookMgr mgr = new BookMgr(booklist);
		
		System.out.println("=== 책 목록 ===");
		mgr.printBookList();
		System.out.println("");
		
		System.out.println("=== 책 가격의 총합 ===");
		mgr.printTotalPrice();
	}
}
