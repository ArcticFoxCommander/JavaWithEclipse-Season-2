package unit4.Assignment1;

	class ExceptionA extends Exception {
	    public ExceptionA(String message) {
	        super(message);
	    }
	}
	
	class ExceptionB extends ExceptionA {
	    public ExceptionB(String message) {
	        super(message);
	    }
	}
	
	class ExceptionC extends ExceptionA {
	    public ExceptionC(String message) {
	        super(message);
	    }
	}


public class Question1 {

	public static void main(String[] args) throws Exception {
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
