package unit3.Assignment3;

public class SavingsAccount extends Account {

	/**
	 * @param accountNumber
	 * @param name
	 * @param address
	 * @param balance
	 * @param annualInterestRate
	 * @param dateCreated
	 */
	public SavingsAccount(int accountNumber, Name name, Address address, double balance, double annualInterestRate) {
		super(accountNumber, name, address, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double amount) {
		if (amount > getBalance()) {
			System.out.println("Exceeded withdrawl limit.");
		}
		else {
			super.withdraw(amount);
		}
	}
	@Override
	public String toString() {
		return String.format("Account ID: %s%n Balance: %.2f%n Date Created: %s", getAccountNumber(), getBalance(),
				getDateCreated(), super.toString());
	}
	
	
	
}
