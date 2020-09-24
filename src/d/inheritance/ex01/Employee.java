//dInheritance01.jpg
package d.inheritance.ex01;

class Employee extends Person {
	
	//멤버 변수에 직접 접근 못하도록 encapsulation 시키기 위해
	//각 변수 private 선언
//	private String name;
//	private int age;
	private String dept;
	
	//default constructor
	public Employee() {
	}
	
	//필드 초기화
	public Employee(String name, int age, String dept) {
		super(name, age);
		
//		this.name = name; super.name = name; //안 됨! Person에서 private로 선언 되었기 때문에
//		this.age = age; // private로 선언 되었기 때문에 접근 불가능
		this.dept = dept;
	}
	
	//private member variable에 접근하기 위한 getter & setter method
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	
	//멤버 변수의 내용을 출력하기 위한 print method
	//Person 클래스의 print() 메소드 오버라이딩
	public void print() {
		System.out.print("이   름 : " + this.getName());
		System.out.print("\t나 이 : " + this.getAge());
		System.out.print("\t부   서 : " + dept);
		System.out.println();
	}
	
}