package Homework12javacore9v1v3;

public class WrongInputConsoleParametersException extends Exception {
	
	private String message ;
	
	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message ;
	}
	public String getMessage() {
		return message;
	}
}
