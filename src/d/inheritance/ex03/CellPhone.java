// Day17 과제 첫번째 장
package d.inheritance.ex03;

public class CellPhone {

	///Field
	private String phoneNumber; // 전화번호
	private int totalCallTime; // 전화사용시간
	private int totalFee; // 사용요금
	private int feePerCallTime; // 시간당 사용요금
	
	///Constructor
	public CellPhone() {
	}

	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}
	
	///Method
	//getter & setter
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTotalCallTime() {
		return totalCallTime;
	}

	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public int getFeePerCallTime() {
		return feePerCallTime;
	}

	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}

	// 전화 사용시간을 증가시키는 call Method
	public void call(String phoneNumber, int totalCallTime) {
		System.out.println(phoneNumber + " 번호로 " + totalCallTime +" 통화함.");
		this.totalCallTime += totalCallTime;
	}
	
	// 사용요금을 계산하는 calculateTotalFee Method
	public void calculateTotalFee() {
		totalFee = totalCallTime * feePerCallTime;
	}
}
