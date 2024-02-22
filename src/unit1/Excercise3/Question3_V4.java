package unit1.Excercise3;

public class Question3_V4 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RT t1 = new RT();
		RT t2 = new RT();
		System.out.println("t1's i = " + t1.i + " and j = " + t1.j);
		System.out.println("t2's i = " + t2.i + " and j = " + t2.j);
	}

}

class RT {
	static int i = 0;
	int j = 0;
	
	RT() {
		i++;
		j = 1;
	}
}
