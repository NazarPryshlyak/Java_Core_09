package Homework12javacore9v2;

public class MyException extends Exception {
	
private String message ;
	
	public MyException(String message) {
		super(message);
		this.message = message ;
	}
	public String getMessage() {
		return message;
	}

}
