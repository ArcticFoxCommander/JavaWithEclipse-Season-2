package unit2.Excercise3;

public class Question13 {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "welcome";
		
		s2 = s1.replaceAll("e", "E");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = "Welcome to Java and HTML";
		String[] token = s3.split(" ");
		
		String s4 = token[0];
		String s5 = token[1];
		
		System.out.printf("%s%n%n%s%n%s%n", s3, s4, s5);
	}

}
