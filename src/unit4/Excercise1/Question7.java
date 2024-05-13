package unit4.Excercise1;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int n = 0;
		int m = 0;
		
		boolean good = false;
		
		while (!good) {
		try {
			System.out.print("Input two integers: ");
			n = input.nextInt();
			m = input.nextInt();
			
			good = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect Input, try again: ");
			input.nextLine();
		}
	}
		System.out.printf("The sum of %s and %s is %s.", n, m, n+m);
}

}
