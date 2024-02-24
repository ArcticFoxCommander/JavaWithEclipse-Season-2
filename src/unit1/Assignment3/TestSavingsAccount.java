package unit1.Assignment3;

public class TestSavingsAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		System.out.println("Saver 1 & 2 with 4% interest.");
		SavingsAccount.modifyInterestRate(0.04);
		for (int i = 1; i <= 12; i++) {
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("Month %d:%n $%.2f %n $%.2f%n",i , saver1.getSavingsBalance(), saver2.getSavingsBalance());
		}

		SavingsAccount.modifyInterestRate(0.05);

		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("Saver 1 & 2 with 5%% interest.\nNext Month:%n $%.2f %n $%.2f%n" , saver1.getSavingsBalance(), saver2.getSavingsBalance());
		
	}
}