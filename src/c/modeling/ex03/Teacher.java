//cModeling03.jpg

package c.modeling.ex03;

class Teacher {
	
	//멤버 변수에 직접 접근 못하도록 encapsulation 시키기 위해
	//각 변수 private 선언
	private String name;
	private int age;
	private String subject;
	
	//default constructor
	public Teacher() {
	}
	
	//필드 초기화
	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	//private member variable에 접근하기 위한 getter & setter method
	public void setName(String name) {
		this.name = name; 
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getSubject() {
		return subject;
	}
	
	//멤버 변수의 내용을 출력하기 위한 print method
	public void print() {
		System.out.print("이   름 : " + this.getName());
		System.out.print("\t나 이 : " + this.getAge());
		System.out.print("\t담당과목 : " + this.getSubject());
		System.out.println();
	}
	
}