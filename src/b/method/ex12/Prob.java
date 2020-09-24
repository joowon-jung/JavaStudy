//bMethod12.jpg

/*
구구단이 세로로 출력됨
print와 println 적절히 사용
static은 클래스 이름으로 접근 (같은클래스면 클래스이름 없어도됨!)
 */
package b.method.ex12;

public class Prob {

	public static void printGugudan(int no) {
		
		if(no < 1 || no >= 10) {
			System.out.println("1 이상 9 이하의 값을 입력하셔야 합니다.");
			return;
		}
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= no; j++) {
				System.out.print(j + "*" + i + "=" + i*j +"  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println("주어진 숫자까지의 구구단을 찍습니다.");
		System.out.println("-------- Sample 1 ----------");
		printGugudan(4); //static 메소드 (같은 클래스 내에선 클래스이름 안 써줘도 됨)
		
		System.out.println("-------- Sample 2 ----------");
		Prob.printGugudan(9); //클래스 이름으로 접근하는 거 습관 들이기!
		
		System.out.println("-------- Sample 3 ----------");
		printGugudan(-1);
		
		System.out.println("-------- Sample 4 ----------");
		printGugudan(10);
	}
}
