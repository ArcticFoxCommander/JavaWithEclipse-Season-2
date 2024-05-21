package unit4.Excercise3;

public class Question1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		m();
		System.out.println("Statement 7");
	}
	
	public static void m() {
		try {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			System.out.println("Statement 3");
		}
		catch (Exception ex1) {
			System.out.println("Statement 4");
		}
		finally {
			System.out.println("Statement 5");
		}
		System.out.println("Statement 6");
	}

}
