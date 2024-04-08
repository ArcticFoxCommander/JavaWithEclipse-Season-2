package unit3;

public class Payday {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter number of employees: ");
		int count = input.nextInt();
		int notes_of_30030 = 0;
		int notes_of_2310 = 0;
		int notes_of_210 = 0;
		int notes_of_30 = 0;
		int notes_of_6 = 0;
		int notes_of_2 = 0;
		int notes_of_1 = 0;
		for (int n = 1; n <= count; n++) {
			System.out.print("Enter the pay for employee " + n + ": ");
			int num = input.nextInt();
			int remaining_value = num;
			while (remaining_value >= 30030) {
				notes_of_30030 += remaining_value / 30030;
				remaining_value = remaining_value % 30030;
				break;
			}
			while (remaining_value >= 2310) {
				notes_of_2310 += remaining_value / 2310;
				remaining_value = remaining_value % 2310;
				break;
			}
			while (remaining_value >= 210) {
				notes_of_210 += remaining_value / 210;
				remaining_value = remaining_value % 210;
				break;
			}
			while (remaining_value >= 30) {
				notes_of_30 += remaining_value / 30;
				remaining_value = remaining_value % 30;
				break;
			}
			while (remaining_value >= 6) {
				notes_of_6 += remaining_value / 6;
				remaining_value = remaining_value % 6;
				break;
			}
			while (remaining_value >= 2) {
				notes_of_2 += remaining_value / 2;
				remaining_value = remaining_value % 2;
				break;
			}
			while (remaining_value >= 1) {
				notes_of_1 += remaining_value;
				break;
			}    
		}input.close();
		System.out.println();
		System.out.println("The number of notes required are: ");
		System.out.println("30030 = " + notes_of_30030);
		System.out.println("2310 = " + notes_of_2310);
		System.out.println("210 = " + notes_of_210);
		System.out.println("30 = " + notes_of_30);
		System.out.println("6 = " + notes_of_6);
		System.out.println("2 = " + notes_of_2);
		System.out.println("1 = " + notes_of_1);
	}
}

