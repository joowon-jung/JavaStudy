//cModeling03.jpg

package c.modeling.ex03;

class Employee {
	
	//멤버 변수에 직접 접근 못하도록 encapsulation 시키기 위해
	//각 변수 private 선언
	private String name;
	private int age;
	private String dept;
	
	//default constructor
	public Employee() {
	}
	
	//필드 초기화
	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	//private member variable에 접근하기 위한 getter & setter method
	public void setName(String name) {
		this.name = name; 
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name; //this.name 해도 상관 x
	}
	public int getAge() {
		return age;
	}
	public String getDept() {
		return dept;
	}
	
	//멤버 변수의 내용을 출력하기 위한 print method
	public void print() {
		System.out.print("이   름 : " + this.getName());
		System.out.print("\t나 이 : " + this.getAge());
		System.out.print("\t부   서 : " + this.getDept());
		System.out.println();
	}
	
}