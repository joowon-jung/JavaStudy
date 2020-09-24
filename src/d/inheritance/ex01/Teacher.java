//dInheritance01.jpg
package d.inheritance.ex01;

class Teacher extends Person {
	
	//멤버 변수에 직접 접근 못하도록 encapsulation 시키기 위해
	//각 변수 private 선언
//	private String name;
//	private int age;
	private String subject;
	
	//default constructor
	public Teacher() {
	}
	
	//필드 초기화
	public Teacher(String name, int age, String subject) {
		super(name, age);
//		this.name = name; super.name = name; //안 됨! Person에서 private로 선언 되었기 때문에
//		this.age = age; // private로 선언 되었기 때문에 접근 불가능
		this.subject = subject;
	}
	
	//private member variable에 접근하기 위한 getter & setter method
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	
	//멤버 변수의 내용을 출력하기 위한 print method
	//Person 클래스의 print() 메소드 오버라이딩
	public void print() {
		System.out.print("이   름 : " + this.getName());
		System.out.print("\t나 이 : " + this.getAge());
		System.out.print("\t담당과목 : " + this.subject);
		System.out.println();
	}
	
}