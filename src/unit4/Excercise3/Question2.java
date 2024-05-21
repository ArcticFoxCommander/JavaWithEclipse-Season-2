package unit4.Excercise3;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNumeric("4949.76666"));
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

//	public static boolean isNumericLoop(String token) {
//
//
//	}
}
