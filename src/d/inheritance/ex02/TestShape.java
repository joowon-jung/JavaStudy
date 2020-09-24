//dInheritance02.jpg

package d.inheritance.ex02;

/*
is - a 관계 성립

도형은 구체적이지가 않음. 삼각형인지 사각형인지 오각형인지 모름
그런데 도형에는 면적 구하는게 반드시 필요함! 
그러나 구체적으로 구할수 없으니 추상메소드를 사용한다.

도형에서 추상적으로 정의했으니
사각형, 직사각형은 면적계산하는 것을 구체적으 로 만들어줘야 하는것이다.

shape 를 감싸고 있는 저게 uml임
[노테이션]
shape -> 클래스 이름
+ -> public
- -> private
# -> protected

도형에 해당하는 두개의 인스턴스를 담는 배열

buscharge 예제 연관!
*/
public class TestShape {

	public static void main(String[] args) {
		
//		Shape shape = new Shape; //추상 클래스는 인스턴스 생성 불가!
		
		//같은 Data Type 묶음(배열 : Array)을 이용하여 일괄적으로 관리
		Shape [] shape = new Shape[2];
		
		shape [0] = new Circle("원", 10);
		shape [1] = new Rectangular("직사각형", 10, 20);
		
		for (int i = 0; i < shape.length; i++) {
			shape[i].calculationArea();
			shape[i].print();
		}
	}

}
