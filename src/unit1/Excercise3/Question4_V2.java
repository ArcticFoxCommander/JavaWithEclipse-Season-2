package unit1.Excercise3;
import java.util.Date;

public class Question4_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(1234567);
		n1(date);
		System.out.println(date.getTime());
	}

	public static void n1(Date date) {
		date.setTime(7654321);
	}
	
}
