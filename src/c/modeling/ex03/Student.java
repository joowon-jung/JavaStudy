//cModeling03.jpg

package c.modeling.ex03;

class Student {
	
	//멤버 변수에 직접 접근 못하도록 encapsulation 시키기 위해
	//각 변수 private 선언
	private String name;
	private int age;
	private int id;
	
	//default constructor
	public Student() {
	}
	
	//필드 초기화
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//private member variable에 접근하기 위한 getter & setter method
	public void setName(String name) {
		this.name = name; 
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	
	//멤버 변수의 내용을 출력하기 위한 print method
	public void print() {
		System.out.print("이   름 : " + this.getName());
		System.out.print("\t나 이 : " + this.getAge());
		System.out.print("\t학   번 : " + this.getId());
		System.out.println();
	}
	
}