package f.exception.ex03;

public class DataFormatException extends RuntimeException {
							// RuntimeException을 상속받아서 사용자 정의 Exception을 만들면
							// try - catch 안 해줘도 됨 ! 
	public DataFormatException() {
	}

	public DataFormatException(String message) {
		super(message);
	}

}
