package unit4.Assignment1;

public class Question6 {

	public static void aMethod() throws Exception {
		try {
			throw new Exception("Exception of aMethod");
		}
		finally {
			System.out.println("Finally of aMethod");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			aMethod();
		}
		
		catch (Exception exception){
			System.out.println("Caught in main " + exception.getMessage());
		}
	}

}
