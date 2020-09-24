//dInheritance01.jpg
package d.inheritance.ex01;

class Person {

	private String name;
	private int age;
	
	//default constructor
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	//멤버 변수의 내용을 출력하기 위한 print method
	public void print() {
		System.out.print("이   름 : " + this.getName());
		System.out.print("\t나 이 : " + this.getAge());
		System.out.println();
	}
}
