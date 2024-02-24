package unit1.Assignment3;

public class SavingsAccount {
	private double savingsBalance = 0;
	private static double annualInterestRate = 0.0;
	
	SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {
		double newSavingsBalance = (savingsBalance * (annualInterestRate) / 12);
		savingsBalance += newSavingsBalance;
	}
	
	public double getSavingsBalance() {
		 return savingsBalance;
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
}
