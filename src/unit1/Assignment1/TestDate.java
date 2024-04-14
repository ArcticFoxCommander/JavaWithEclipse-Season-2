package unit1.Assignment1;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PUT IN NUMBERS AS MM/DD/YYYY
		// OUTPUT IS IN YYYY/MM/DD
		Date inputtedDate = new Date(2, 23, 2024);
		System.out.println(inputtedDate.displayDate());
		
		Date inputtedDate1 = new Date(1, 1, 2030);
		System.out.println(inputtedDate1.displayDate());
	}

}
