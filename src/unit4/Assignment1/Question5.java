package unit4.Assignment1;

class someClass {
	public someClass() throws Exception {
		throw new Exception("Constructor failure!");
	}
}

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            someClass objectOfTypeSomeClass = new someClass();
	        } catch (Exception exception) {
	            System.out.println("Caught exception: " + exception.getMessage());
	        }
	}

}
