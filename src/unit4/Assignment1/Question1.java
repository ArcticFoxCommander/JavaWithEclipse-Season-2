package unit4.Assignment1;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new ExceptionC("Exception C");
		}
		catch (ExceptionA e) {
			System.out.println("Caught Exception A: " + e.getMessage());
		}
		
		try {
			throw new ExceptionB("Exception B");
		}
		catch (ExceptionA e) {
			System.out.println("Caught Exception A: " + e.getMessage());
		}
		
		try {
			throw new ExceptionA("Exception A");
		}
		catch (ExceptionA e) {
			System.out.println("Caught Exception A: " + e.getMessage());
		}
	}

}
