//bMethod04.jpg

/*
주어진 매서드의 시그니쳐는 변경하지 않는다
시그니쳐 : 매서드의 형태
메인 메서드에 때려박으면 재사용성이 떨어짐
매서드로 만들어 놓으면 언제든지 인스턴스 생성하여 재사용 할 수 있음

Prob aaa = new Prob();
aaa.printSeason(month);

new Prob().printSeason(month); 
new Prob().printSeason(Integer.parseInt(args[0]);

==> 중요 ★ 다 같은 형태 ! 
*/

package b.method.ex04;

public class Prob {

	public static void main(String[] args) {
		
		int month = Integer.parseInt(args[0]);
		new Prob().printSeason(month); //인스턴스 생성과 동시에 메소드 호출
//		Prob10 aaa = new Prob10(); //인스턴스 생성
//		aaa.printSeason(month);
	}
	
	public void printSeason(int month) {
		
//		[ validation check ]
//		if (month < 0 || month > 12) {
//			System.out.println("1~12 사이의 숫자만 입력하셔야 합니다");
//			return; //메소드 종료
//		}
		
		//String season = "봄";
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄에 태어나셨네요."); 
			break;
		case 6:
		case 7:
		case 8:
			//season = "여름";
			System.out.println("여름에 태어나셨네요.");
			break;
		case 9:
		case 10:
		case 11:
			//season = "가을";
			System.out.println("가을에 태어나셨네요.");
			break;
		case 12:
		case 1:
		case 2:
			//season = "겨울";
			System.out.println("겨울에 태어나셨네요.");
			break;
		default:
			System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
			break; //메모리 낭비되지 않게 return; 하고 메소드 종료해도 됨!
		}
		//System.out.println(season + "에 태어나셨네요.");
	}
}
