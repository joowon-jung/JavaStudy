//cModeling02.jpg

package c.modeling.ex02;
/*
레퍼런스 값 (String 등등..) 초기화  : null
int값 초기화 : 0
boolean 값 초기화 : false

생성자 오버로딩
throws Exception <<안 배운 것이니까 신경 쓰지 말고 쓰기
*/
public class TestAccount {

	public static void main(String[] args) throws Exception {
		
		String accNo = null;
		int balance = 0;
		
		Account accObj = new Account("078-3762-292"); //인스턴스 생성
		accNo = accObj.getAccNo();
		//accNo = new Account("078-3762-292");
		balance = accObj.getBalance();
		
		accObj.save(100);
		balance = accObj.getBalance();
		
		accObj.deposit(30);
		balance = accObj.getBalance();
	}
}

class Account {
	
	//getter & setter 로 값 지정 반환하고 있으니 private 사용해 본 것 (안써도 무관)
	private String accNo; //알아서 초기화 해주니까 굳이 String accNo = null; 해줄 필요 없음!
	private int balance;
	
	public Account() {
		
	}
	
	//생성자
	public Account(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + " 계좌가 개설되었습니다.");
	}
	
	//입금
	public void save (int num) {
		balance += num;
		System.out.println(accNo + " 계좌에 " + num + "만원이 입금되었습니다.");
	}
	
	//출금
	public void deposit (int num) {
		balance -= num;
		System.out.println(accNo + " 계좌에 " + num + "만원이 출금되었습니다.");
	}
	
	//계좌번호, 잔고 리턴하는 getter 메소드
	public int getBalance() {
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
		return balance;
	}
	
	public String getAccNo() {
		return accNo;
	}
}
