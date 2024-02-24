package unit1.Assignment3;

public class TestSavingsAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		// For this EXCERCISE, INPUT saver 1 for 2000.00 and saver 2 for 3000.00
		System.out.println("Enter the amount for saver1: ");
		double amt1 = input.nextDouble();
		System.out.println("Enter the amount for saver2: ");
		double amt2 = input.nextDouble();
		
		input.close();
		
		SavingsAccount saver1 = new SavingsAccount(amt1);
		SavingsAccount saver2 = new SavingsAccount(amt2);
		
		System.out.println("Saver 1 & 2 with 4% interest.");
		SavingsAccount.modifyInterestRate(0.04);
		for (int i = 1; i <= 12; i++) {
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("Month %d:%n $%.2f %n $%.2f%n",i , saver1.getSavingsBalance(), saver2.getSavingsBalance());
		}
		
		saver1 = new SavingsAccount(amt1);
		saver2 = new SavingsAccount(amt2);
		
		SavingsAccount.modifyInterestRate(0.05);

		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("Saver 1 & 2 with 5%% interest.\nNext Month:%n $%.2f %n $%.2f%n" , saver1.getSavingsBalance(), saver2.getSavingsBalance());
		
	}
}