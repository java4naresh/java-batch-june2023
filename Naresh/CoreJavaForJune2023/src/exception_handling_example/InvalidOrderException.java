package exception_handling_example;

public class InvalidOrderException extends RuntimeException {
	
	public InvalidOrderException(String msg) {
		super(msg);
	}

}