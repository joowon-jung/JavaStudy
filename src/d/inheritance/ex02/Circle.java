//dInheritance02.jpg

package d.inheritance.ex02;

public class Circle extends Shape {

	///Field - 캡슐화 (encapsulation)
	private double radius;
	
	///Constructor
	public Circle() {
		//super();
	}
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	///Method 
	//getter & setter method
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public void calculationArea() { //추상메소드 오버라이딩 반드시!
		this.area = radius * radius * Math.PI;
//		this.setArea(radius * radius * Math.PI);
	}
//	public void print() { //해줄 필요 없음! Shape의 print()와 형태 동일
//		super.print();
//	}
	
}
