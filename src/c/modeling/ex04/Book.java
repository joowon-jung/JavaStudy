//cModeling04.jpg

package c.modeling.ex04;

public class Book { // <물리적> 책을 추상화 & 캡슐화 한 것
	
	///Field - information hiding
	private String title; //책 제목 
	private int price; //가격

	///Constructor
	public Book() {
	}
	
	//필드 초기화하는 생성자
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	///Method
	//필드가 캡슐화 된 정보라서 get & set 으로 값 받아온다
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}
