//cModeling01.jpg
/*
object modeling

ex) 상태값이 내가 의도한게 아니라 밖에서 의도한 대로 바뀔 수도 있음
	예를들어 사원은 3년 후에 대리가 됨

상태값을 세팅할 때 쓰는 메소드 : setter
값을 가져옴 : getter

nextint() : int 값 리턴
next() : string 값 리턴
*/
package c.modeling.ex01;

import java.util.Scanner;

public class TestRectangle {
	
	///main method
	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		Rectangle rec1 = new Rectangle();
		System.out.println("첫번째 직사각형의 색깔 : ");
		rec1.setColor(keyboard.next());
		
		System.out.println("첫번째 직사각형의 가로 : ");
		rec1.setWidth(keyboard.nextInt());
		
		System.out.println("첫번째 직사각형의 세로 : ");
		rec1.setLength(keyboard.nextInt());
		
		Rectangle rec2 = new Rectangle();
		System.out.println("두번째 직사각형의 색깔 : ");
		rec2.setColor(keyboard.next());
		
		System.out.println("두번째 직사각형의 가로 : ");
		rec2.setWidth(keyboard.nextInt());
		
		System.out.println("두번째 직사각형의 세로 : ");
		rec2.setLength(keyboard.nextInt());
		
		System.out.println(rec1.getColor() + " 직사각형의 넓이는 " + rec1.area() +
							"이고 둘레는 " + rec1.perimeter() + "입니다. ");
		System.out.println(rec2.getColor() + " 직사각형의 넓이는 " + rec2.area() +
				"이고 둘레는 " + rec2.perimeter() + "입니다. ");
		
		//넓이 비교
		if (rec1.area() == rec2.area()) {
			System.out.println("넓이는 같습니다.");
		} else if (rec1.area() > rec2.area()){
			System.out.println("넓이는 " + rec1.getColor() + " 직사각형이 더 큽니다.");
		} else {
			System.out.println("넓이는 " + rec2.getColor() + " 직사각형이 더 큽니다.");
		}
		
		//둘레 비교
		if (rec1.perimeter() == rec2.perimeter()) {
			System.out.println("둘레는 같습니다.");
		} else if (rec1.perimeter() > rec2.perimeter()){
			System.out.println("둘레는 " + rec1.getColor() + " 직사각형이 더 깁니다.");
		} else {
			System.out.println("둘레는 " + rec2.getColor() + " 직사각형이 더 깁니다.");
		}
	}

}

class Rectangle {
	
	//getter & setter 로 값 지정 반환하고 있으니 private 사용해 본 것 (안써도 무관)
	private int width; //인스턴스 생성시 0으로 초기화
	private int length;
	private String color; //인스턴스 생성시 null으로 초기화
	
	//setter : 값 세팅
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//getter : 값 리턴
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	public String getColor() {
		return color;
	}
	
	//직사각형의 넓이를 계산하는 area 메소드
	public int area() {
		return width * length;
	}
	
	//직사각형의 둘레의 길이를 계산하는 perimeter 메소드
	public int perimeter() {
		return (width + length) * 2;
	}
}
