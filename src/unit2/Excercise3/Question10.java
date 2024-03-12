package unit2.Excercise3;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome to Java";
		String s2 = s1;
		String s3 = new String("Welcome to Java");
		String s4 = "Welcome to Java";
		
		if (s1 == s3) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if (s1.equals(s3)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		String s5 = s4.replace("Java", "Python");
		String s6 = "Java";
		s1.replace('o', 'T');
		s1.replaceAll("o", "T");
		s1.replaceFirst("o", "T");
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", s1, s2, s3, s4, s5, s6);
	}

}
