// Day17 과제 세번째 장
package f.exception.ex01;

public class CellPhone {

	///field
	public String model; // 핸드폰 모델 번호
	public double battery; // 남은 배터리 양
	
	///Constructor
	public CellPhone() {
	}
	
	// 모델 번호를 인자로 받는 생성자
	public CellPhone(String model) {
		this.model = model;
	}
	
	///method
	
	// 통화 시간(분)을 출력하고, 통화 시간에 따라 배터리 양을 감소시킨다
	// [ 감소되는 배터리 양 = 통화시간(분) * 0.5 ]
	// 배터리 양은 0보다 작아지지 않는다.
	// 통화시간이 0보다 작은 경우에는 IllegalArgumentException("통화시간입력오류") 를 발생
	public void call(int time) throws IllegalArgumentException{
		if (time < 0) {
			// int 에는 - 값을 받을 수 있지만 우리 모델링에는 위반됨. - 분은 있을 수 없음
			// ==> 문법적으로 이상하지 않음! 그러므로 내가 문제를 발생 시켜줘야 함 !
			throw new IllegalArgumentException("통화시간입력오류");
		}
		
		System.out.println("통화 시간 : " + time + " 분");
		
		double amount = time * 0.5; // 통화 시간에 따른 배터리 소모량
		if (battery < amount) { 
			battery = 0;
		} else {
			battery -= amount;
		}
	}
	
	// 충전한 시간(분)을 출력하고, 충전한 시간에 따라 배터리 양을 증가시킨다.
	// [ 충전되는 배터리 양 = 충전시간(분) * 3 ]
	// 배터리 양은 100까지만 증한다.
	// 충전시간이 0보다 작은 경우에는 IllegalArgumentException("충전시간입력오류")
	public void charge(int time) throws IllegalArgumentException{
						// throws 안 해도 되는 이유 : IllegalArgumentException은 RuntimeException(unChecked)이다!
						// RuntimeException은 명시적으로 try-catch 처리를 하지 않아도 되므로 throws 지워도 오류 안 남
						// 하지만 throws를 쓰는걸 습관화 하자 !
		if (time < 0) { 
			throw new IllegalArgumentException("충전시간입력오류");
		}
		
		System.out.println("충전 시간 : " + time + " 분");
		
		double amount = time * 3; // 충전 시간에 따른 배터리 충전량
		if (battery + amount > 100) {
			battery = 100;
		} else {
			battery += amount;
		}
		
	}
	
	// 남은 배터리 양 출력
	public void printBattery() {
		System.out.println("남은 배터리 양 : " + battery);
	}
	
	// *** equals 메소드 오버라이딩 ***
	// Object 타입의 객체를 입력받고, 입력받은 객체가
	// CellPhone 타입의 클래스이면서 모델 번호가 같은 경우에 true 리턴
	public boolean equals(Object otherObject) {
		
		if (otherObject == null) { // 아무것도 받지 않으면
			return false;
		} else if (!(otherObject instanceof CellPhone)) { 
			// 입력받은 객체가 CellPhone 타입의 클래스인지 확인
			// 어떤 타입에 대한 instanceof 연산의 결과가 true라는 것은,
			// 검사한 타입으로 형변환이 가능하다는 것을 뜻함 !
			return false;
		} else {
			//return this.model == ( (CellPhone) otherObject ).model; 
			//레퍼런스 타입 비교할 때는 항상 equals 메소드 사용해주기!
			return this.model.equals( ( (CellPhone) otherObject ).model ); 
		}
	}
}
