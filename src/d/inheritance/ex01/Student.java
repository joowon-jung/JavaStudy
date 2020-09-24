//dInheritance01.jpg

package d.inheritance.ex01;

class Student extends Person {
	
	//멤버 변수에 직접 접근 못하도록 encapsulation 시키기 위해
	//각 변수 private 선언
//	private String name;
//	private int age;
	private int id;
	
	//default constructor
	public Student() {
	}
	
	//필드 초기화
	public Student(String name, int age, int id) {
		super(name, age); //Person 클래스 안의 인자 두개 받는 생성자 호출
//		this.name = name; super.name = name; //안 됨! Person에서 private로 선언 되었기 때문에
//		this.age = age; // private로 선언 되었기 때문에 접근 불가능
		
//		this.setName(name); //메소드에 접근하는 거니까 가능
//		this.setAge(age); //메소드에 접근하는 거니까 가능
		this.id = id;
	}
	
	//private member variable에 접근하기 위한 getter & setter method
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	//멤버 변수의 내용을 출력하기 위한 print method
	//Person 클래스의 print() 메소드 오버라이딩
	public void print() {
//		super.print();
		System.out.print("이   름 : " + this.getName()); 
		System.out.print("\t나 이 : " + this.getAge());
		System.out.print("\t학   번 : " + this.getId());
		System.out.println();
		
//		super.print();
//		System.out.print("\t학   번 : " + this.getId());
	}
	
}