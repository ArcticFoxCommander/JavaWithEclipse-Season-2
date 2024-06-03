package unit4.Assignment1;

import java.io.IOException;

	class ExceptionA2 extends Exception {
	    public ExceptionA2(String message) {
	        super(message);
	    }
	}
	
	class ExceptionB2 extends ExceptionA {
	    public ExceptionB2(String message) {
	        super(message);
	    }
	}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new ExceptionA("ExceptionA occurred");
		} catch (Exception exception) {
			System.out.println("Caught: " + exception.getMessage());
		}

		try {
			throw new ExceptionB("ExceptionB occurred");
		} catch (Exception exception) {
			System.out.println("Caught: " + exception.getMessage());
		}

		try {
			throw new NullPointerException("NullPointerException occurred");
		} catch (Exception exception) {
			System.out.println("Caught: " + exception.getMessage());
		}

		try {
			throw new IOException("IOException occurred");
		} catch (Exception exception) {
			System.out.println("Caught: " + exception.getMessage());
		}
	}

}
