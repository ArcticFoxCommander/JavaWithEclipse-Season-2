package unit4.Assignment1;

import java.io.IOException;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Catching ExceptionA
		try {
			throw new ExceptionA("ExceptionA occurred");
		} catch (Exception e) {
			System.out.println("Caught: " + e.getMessage());
		}

		// Catching ExceptionB
		try {
			throw new ExceptionB("ExceptionB occurred");
		} catch (Exception e) {
			System.out.println("Caught: " + e.getMessage());
		}

		// Catching NullPointerException
		try {
			throw new NullPointerException("NullPointerException occurred");
		} catch (Exception e) {
			System.out.println("Caught: " + e.getMessage());
		}

		// Catching IOException
		try {
			throw new IOException("IOException occurred");
		} catch (Exception e) {
			System.out.println("Caught: " + e.getMessage());
		}
	}

}
