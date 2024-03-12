package unit2.Excercise3;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome";
		String s2 = "welcome";
		
		s2 = s1.replaceAll("e", "E");
		
		System.out.println(s1);
		
		String s3 = "Welcome to Java and HTML";
		String[] token = s3.split(" ");
		
		s1 = token[0];
		s2 = token[1];
		
		System.out.printf("%s%n%s%n%s%n", s1, s2, s3);
	}

}
