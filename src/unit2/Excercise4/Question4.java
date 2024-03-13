package unit2.Excercise4;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Write java code for five hours every night.");
		StringBuilder ssb = new StringBuilder("The assignment is due at six pm every night.");
		StringBuilder sssb = new StringBuilder("The quiz is on Friday and contains 8 pages.");
		
		System.out.printf("%s%n%s%n%s%n%n", sb, ssb, sssb);
		
		StringBuilder b = sb.delete(4, 10);
		StringBuilder bb = ssb.delete(4, 10);
		StringBuilder bbb = sssb.delete(4, 10);
		
		System.out.printf("%s%n%s%n%s%n", b, bb, bbb);
	}

}
