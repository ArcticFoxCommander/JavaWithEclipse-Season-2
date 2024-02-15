package unit1.Excercise2;

public class TestFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColour("Yellow");
		fan1.setOn(true);
		System.out.println(fan1.toString());
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColour("Blue");
		fan2.setOn(false);
		System.out.println(fan2.toString());
	}

}
