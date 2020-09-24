//aBase07.jpg

package a.base.ex07;

public class Prob {

	public static void main(String[] args) {

		int year = 2010;
		int month = 2;
		int maxDay = 0;

		if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) { //조건 1,3
			maxDay = 29; //윤년
		}
		else if (year % 4 == 0 && year % 100 == 0) { //조건 2
			maxDay = 28; //윤년이 아님
		}
		else { 			 //나머지 전부
			maxDay = 28; //윤년이 아님
		}
		
		System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "일 입니다");
	}

}