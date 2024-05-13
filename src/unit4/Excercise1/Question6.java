package unit4.Excercise1;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			System.out.print(i + " ");
			// System.out.println(1/0);
			try {
				System.out.println(1/0);
			}
			catch (Exception e) {
					
			}
		}
	}

}
