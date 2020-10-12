package g.io.ex09;

// User VO의 활용 
public class User {

	///Field
	private String name;
	private String address;
	private String cellularNumber;
	private boolean male;
	
	///Constructor
	public User() {
		super();
	}
	
	public User(String name, String address, String cellularNumber, boolean male) {
		super();
		this.name = name;
		this.address = address;
		this.cellularNumber = cellularNumber;
		this.male = male;
	}

	///Method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellularNumber() {
		return cellularNumber;
	}

	public void setCellularNumber(String cellularNumber) {
		this.cellularNumber = cellularNumber;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 핸드폰 : " + cellularNumber + ", 성별 : " 
				+ (male ? "남" : "여")
				+ ", 주소 : " + address;
	}

}
