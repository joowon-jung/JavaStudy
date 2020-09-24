//dInheritance02.jpg

package d.inheritance.ex02;

public class Rectangular extends Shape {
	
	///Field - 캡슐화 (encapsulation)
	private double width;
	private double hight;
	
	///Constructor
	public Rectangular() {
		
	}
	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}
	
	///Method 
	//getter & setter method
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public double getHight() {
		return hight;
	}
	
	public void calculationArea() {
		area = width * hight;
	}
//	public void print() { //해줄 필요 없음! Shape의 print()와 형태 동일
//	super.print();
//	}
}
