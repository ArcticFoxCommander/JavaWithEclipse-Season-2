package unit3.Assignment3;

public class ChequingsAccount extends Account {
	private double overDraftLimit;

	/**
	 * @param accountNumber
	 * @param name
	 * @param address
	 * @param balance
	 * @param annualInterestRate
	 * @param overDraftLimit 
	 * @param dateCreated
	 */
	public ChequingsAccount(int accountNumber, Name name, Address address, double balance, double annualInterestRate, double overDraftLimit) {
		super(accountNumber, name, address, balance, annualInterestRate);
		this.overDraftLimit = overDraftLimit;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double amount) {
		if (amount > getBalance() + overDraftLimit) {
			System.out.println("Overdraft limit exceeded.");
		}
		else {
			super.withdraw(amount);
		}
	}
	
	
	
	/**
	 * @return the overDraftLimit
	 */
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	/**
	 * @param overDraftLimit the overDraftLimit to set
	 */
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	@Override
	public String toString() {
	    if (overDraftLimit == 0) {
	        return super.toString() + "Overdraft protection not included.\n";
	    } 
	    else {
	        return super.toString() + "\nOverdraft protection up to: $" + overDraftLimit;
	    }
	}

}

