//fException03_2.jpg 
package f.exception.ex03;

// Book 을 모델링 한 클래스 
public class Book {

	///Field
	private String title;
	private String kind;
	private int rentalPrice;
	
	///Constructor
	public Book() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	// toString() 메소드 @Override
	public String toString() {
		return "Book [title=" + title + ", kind=" + kind + ", rentalPrice=" + rentalPrice + "]";
	}
	
}
