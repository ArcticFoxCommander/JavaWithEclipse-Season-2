package unit1.Assignment1;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date inputtedDate = new Date();
		inputtedDate.day = 16;
		inputtedDate.month = 2;
		inputtedDate.year = 2024;
		System.out.println(inputtedDate.displayDate());
		
		Date inputtedDate1 = new Date();
		inputtedDate1.day = 1;
		inputtedDate1.month = 1;
		inputtedDate1.year = 2030;
		System.out.println(inputtedDate1.displayDate());
	}

}
