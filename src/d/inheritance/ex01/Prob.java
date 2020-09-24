//dInheritance01.jpg

package d.inheritance.ex01;

public class Prob {
	
	public static void main(String[] args) {
		
//		Person p = new Person("정주원", 22);
		Student s = new Student("홍길동", 20, 200201);
		Teacher t = new Teacher("이순신", 30, "JAVA");
		Employee e = new Employee("유관순", 40, "교무과");
		
//		p.print(); //메소드 오버라이딩 된 것을 알 수 있음 !
		s.print();
		t.print();
		e.print();
	}
}