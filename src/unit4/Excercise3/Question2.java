package unit4.Excercise3;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNumeric("342"));
		System.out.println(isNumericLoop("342"));
	}

	public static boolean isNumeric(String token) {
		try {
			Double.parseDouble(token);
			return true;
		}
		catch (java.lang.NumberFormatException ex) {
			return false;
		}
	}

	public static boolean isNumericLoop(String token2) {
	    if (token2 == null || token2.isEmpty()) {
	        return false;
	    }
 
	    for (int i = 0; i < token2.length(); i++) {
	        if (!Character.isDigit(token2.charAt(i)) && token2.charAt(i) != '.') {
	            return false;
	        }
	    }
		return true;
	}
}
