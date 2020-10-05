// Day17 과제 첫번째 장
package d.inheritance.ex03;

public class SmartPhone extends CellPhone {

	///Field
	
	// private 선언하고 get & set 안 만드는 경우에는, 값을 변경시킬 의도가 없는 거니까 final 써 줘도 됨!
	private boolean isMonthlyFixedRate; // 월정액 요금제 유무
	private int monthlyFixedFee; // 월정액 요금
	
	///Construcdtor
	public SmartPhone() {
	}

	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}
	
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime); //this(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	///Method
	public boolean isMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}


	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}


	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}


	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	// CellPhone 클래스의 사용요금을 계산하는 
	// calculateTotalFee Method 오버라이딩
	public void calculateTotalFee() {
		if (isMonthlyFixedRate == true) { // 월정액 요금제 유무
			System.out.println("고객님은 " + monthlyFixedFee + " 정액 요금제입니다.");
			setTotalFee(monthlyFixedFee);
		}
		else {
			super.calculateTotalFee(); // 정확히 super 키워드를 사용해주는게 좋다!
		}
	}
	
}
