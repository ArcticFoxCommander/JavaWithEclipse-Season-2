package unit1.Assignment3;

public class TestSavingsAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(0.04);
		for (int i = 0; i < 12; i++) {
		saver1.calculateMonthlyInterest();
		int j = i+1;
		System.out.printf("month " + j + ": %.2f \n", saver1.getSavingsBalance());
		}
	}

}