package unit2.Excercise1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time currentTime = new Time();
		Time elapsedTime = new Time(555550000);
		
		System.out.println(currentTime.getHour() + "h " + currentTime.getMinute() + "m " + currentTime.getSecond() + "s ");
		System.out.println(elapsedTime.getHour() + "h " + elapsedTime.getMinute() + "m " + elapsedTime.getSecond() + "s ");
	}

}
