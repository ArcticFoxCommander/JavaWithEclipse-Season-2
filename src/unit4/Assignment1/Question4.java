package unit4.Assignment1;

public class Question4 {


	public static void someMethod() throws Exception {
		// TODO Auto-generated method stub
		try {
			someMethod2();
		}
		catch (Exception e) {
			System.out.println("Exception on someMethod.");
			throw e;
		}
	}

	private static void someMethod2() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Exception on someMethod2.");
	}

	public static void main(String[] args) {
		 try {
	            someMethod();
	        } catch (Exception e) {
	            System.out.println("Caught in main:");
	            e.printStackTrace();
	        }
	}
	
}
