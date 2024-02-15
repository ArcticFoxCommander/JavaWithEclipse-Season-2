package unit1.Excercise2;

public class ExpTestFan {

	public static void main(String[] args) {
		ExpFan fan1 = new ExpFan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		System.out.println(fan1.toString());

		ExpFan fan2 = new ExpFan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println(fan2.toString());
	}
}
