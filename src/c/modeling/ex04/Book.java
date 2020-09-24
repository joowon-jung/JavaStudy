//cModeling04.jpg

package c.modeling.ex04;

public class Book {
	
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
