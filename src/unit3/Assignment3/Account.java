package unit3.Assignment3;

import java.util.Date;

public class Account {

	private int accountNumber;
	private Name name;
	private Address address;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	/**
	 * @param accountNumber
	 * @param name
	 * @param address
	 * @param balance
	 * @param annualInterestRate
	 * @param dateCreated
	 */
	public Account(int accountNumber, Name name, Address address, double balance, double annualInterestRate) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.setAddress(address);
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		setDateCreated(new Date());
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public Date dateCreated() {
		return getDateCreated();
	}
	
	void setAnnualInterestRate(double e) {
		annualInterestRate = e;
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	double getMonthlyInterest() {

		return getBalance() * (annualInterestRate / 1200);	
	}
	
	public Name getName() {
		return name;
	}
	
	public void withdraw(double withdraw) {
		if (withdraw > balance) {
			System.out.println("Withdrawl amount exceeds balance. Try again.");
			System.exit(0);
		}
		else {
		balance -= withdraw;
	}
}

	public void deposit(double deposit) {
		balance += deposit;
	}

	@Override
	public String toString() {
		return String.format("Account ID: %s%n Balance: %.2f%n Date Created: %s", accountNumber, balance,
				getDateCreated());
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	

}
