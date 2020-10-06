package f.exception.ex02;

public class Account {
	
	/// field - information hiding
	public String accountNo; // 계좌번호
	public boolean creditLine; // 마이너스통장 유무
	public int creditLineLimit; // 마이너스금액한도
	public int balance; // 통장잔고

	/// constructor - 다양한 상태값 세팅
	public Account() {
	}
	
	// 상태값 초기화 생성자
	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;
		this.balance = balance;
	}
	
	/// method 
	// information hiding 된 정보의 Message를 주고 받기 위한 get & set method
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public boolean isCreditLine() {
		return creditLine;
	}
	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}
	public int getCreditLineLimit() {
		return creditLineLimit;
	}
	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 입금 method -> 통장잔고 변경
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금 method -> 통장잔고 변경
	// 출금시 잔고부족 한 경우(마이너스통장의 경우 마이너스금액 한도 포함)
	// "잔고부족 출금불가 합니다" 의 message를 갖는 java.lang.Exception 발생시킬 것
	public void withdraw(int money) throws Exception {
								// checked Exception 이니 반드시 예외처리 해줘야 함!
								// unchecked Exception(Runtime Exception)은 try - catch 안 해줘도 됨!
		if ( creditLine && ( creditLineLimit + balance ) < money ) {
			// 마이너스 통장 이고, 마이너스통장한도 + 현재 통장 잔고 < 출금할 돈
			throw new Exception("잔고부족 출금불가 합니다.");
		}
		if (! creditLine && balance < money ) {
			// 마이너스 통장이 아니고, 현재 통장 잔고가 출금할 돈보다 적으면
			throw new Exception("잔고부족 출금불가 합니다.");
		}
		this.balance -= money;
	}

	@Override
	public String toString() {
		if (creditLine == true) { // 마이너스통장이면
			return " 계좌번호 : " + accountNo + ", 잔고 : " + balance + " 원 [[ -" + creditLineLimit +"원 마이너스 통장 ]]";
		} else { // 마이너스통장이 아니면
			return " 계좌번호 : " + accountNo + ", 잔고 : " + balance + " 원";
		}
		
//		return " 계좌번호 : " + accountNo + ", 잔고 : " + balance + " 원" + 
//				(creditLine ? "  [[ -" + creditLineLimit + "원 마이너스 통장 ]]" : " ");
//				// (true 이면 ? 실행 : 아니면 이부분 실행)
//		==> 3항연산자 사용하면 코딩 편리 but 가독성 떨어짐. if문 사용하면 가독성은 좋으나 코드가 길어짐. 편한대로 사용
	}

}
