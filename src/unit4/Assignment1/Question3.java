package unit4.Assignment1;

public class Question3 {

	class ExceptionA3 extends Exception {
	    public ExceptionA3(String message) {
	        super(message);
	    }
	}

	class ExceptionB3 extends ExceptionA3 {
	    public ExceptionB3(String message) {
	        super(message);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Unreachable catch block for Question3.ExceptionB. It is already handled by the catch block for Question3.ExceptionA

//		try {
//			throw new ExceptionB3("Exception B Occured");
//		} catch (ExceptionA3 exception) {
//			System.out.println("Exception Caught: " + exception.getMessage());
//		} catch (ExceptionB3 exception) {
//			System.out.println("Exception Caught: " + exception.getMessage());
//		}
		
		// Reachable!
		
        try {
            throw new Exception("ExceptionB3 occurred");
        } catch (ExceptionB3 e) {
            System.out.println("Caught ExceptionB3: " + e.getMessage());
        } catch (ExceptionA3 e) {
            System.out.println("Caught ExceptionA3: " + e.getMessage());
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
        	System.out.println("Final3");
        }
		
	}

}
