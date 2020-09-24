//bMethod15.jpg

package b.method.ex15;
/*
홀수의 합 짝수의 합 포문 돌려가면서 출력
상태값 건드리는게 없으니 public static void calc 이렇게도 해보기!
static 메소드는 클래스이름으로 접근할 수 있고
!! 같은 클래스 내에 static 은 그냥 접근할 수도 있다 !!
private도 해보고 여러개 스스로 시도해서 해보기!!
*/
public class Prob {

	public static void calc(int[] ix) {
		
		int oddnumSum = 0; //홀수의 합
		int evennumSum = 0; //짝수의 합
		
		for (int i = 0; i < ix.length; i++) {
			if (ix[i] % 2 != 0) {
				oddnumSum += ix[i];
			} else {
				evennumSum += ix[i];
			}
		}
		System.out.println("홀수의 합 : " + oddnumSum);
		System.out.println("짝수의 합 : " + evennumSum);
	}
	
	public static void main(String[] args) {
		
		int[] ia = new int[] {3, 7, 1, 8, 10, 2, 15, 2, 10};
		int[] ib = new int[] {1, 2, 3, 4, 5};
		
//		Prob16 p = new Prob16();
		System.out.println(" ( 배열 ia )");
		Prob.calc(ia);
		System.out.println(" ( 배열 ib )");
		calc(ib); //Prob.calc(ib); 도 가능!
	}
	
}
