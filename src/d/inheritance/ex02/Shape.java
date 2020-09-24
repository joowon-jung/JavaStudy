//dInheritance02.jpg

package d.inheritance.ex02;

public abstract class Shape {
	
	///Field - 캡슐화 (encapsulation)
	protected double area;
	private String name;
	
	///Constructor
	public Shape() { //default Constructor
	}
	
	public Shape(String name) { //Constructor OverLoading
		this.name = name;
	}
	
	///Method 
	//getter & setter method
	//메소드는 공개해서 외부에서 메소드를 통해 private 데이터에 접근하도록 함.
	public void setArea(double area) {
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//abstract method
	//하위클래스에서 반드시 오버라이딩!
	public abstract void calculationArea();
	
	public void print() {
		System.out.println(getName() + "의 면적은 " + this.area);
												//getArea() 도 가능!
	}
}
