//scan0010.jpg

package a.base.ex00;

//대소비교 if문 으로 하기
//switch문으로도 해보기
//입력받은 수가 0 미만이고 100 이상이면 어떻게 처리 할 것인가

/*
	camel      케이스    /    snake   케이스
	ClassName 				class_name	  (클래스)
	variableName 			variable_name (변수)
	-> 자바는 camel 케이스로 identifier를 구별함 !
*/

public class Example1 {

	public static void main(String args[]) {
							// camel case에 따르면
							// String은 Class 임!

//		int i = Integer.parseInt(args[0]); // Integer도 Class
//
//		if (i >= 1 && i <= 100) {  //validation check
//
//			switch (i / 10) {
//			case 1:
//			case 2:
//			case 3:
//			case 4:
//			case 5:
//				System.out.println("입력하신 값 " + i + "점은 가입니다.");
//				break;
//			case 6:
//				System.out.println("입력하신 값 " + i + "점은 양입니다.");
//				break;
//			case 7:
//				System.out.println("입력하신 값 " + i + "점은 미입니다.");
//				break;
//			case 8:
//				System.out.println("입력하신 값 " + i + "점은 우입니다.");
//				break;
//			case 9:
//			case 10:
//				System.out.println("입력하신 값 " + i + "점은 수입니다.");
//				break;
//			default:
//				System.out.println("0~100 사이의 값을 입력해 주세요.");
//				break;
//			}
//		} else {
//			System.out.println("0~100 사이의 값을 입력해 주세요.");
//		}

		
		//refactoring (기존의 코드를 더 효율적으로 수정 보완)
		int i = Integer.parseInt(args[0]);
		
		if (i < 0 || i > 100) {
			System.out.println("0~100 사이의 값을 입력해 주세요.");
			return; //프로그램 여기서 그냥 끝내버림 !
		}
		
		String grade = "수";	//default 값을'수'라고 지정
		switch (i / 10) {
		case 10 :
		case 9 :
			//grade 는 변동없이 '수'임
			break; 
		case 8 :
			grade = "우";
			break;
		case 7 :
			grade = "미";
			break;
		case 6 :
			grade = "양";
			break;
		default :
			grade = "가";
		}
		
		System.out.println("입력하신 값 "+i+"점은 "+grade+" 입니다.\n");
	}

}