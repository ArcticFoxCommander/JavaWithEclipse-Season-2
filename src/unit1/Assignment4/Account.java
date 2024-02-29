package unit1.Assignment4;

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();

	Account() {
		this(0, 0.0, 0.0);
	}

	Account(int id, double balance, double annualInterestRate) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}


	public Date dateCreated() {
		return dateCreated;
	}

	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	double getMonthlyInterest() {

		return getBalance() * (annualInterestRate / 1200);	
	}

	public void withdraw(double withdraw) {
		if (withdraw > getBalance()) {
			System.out.println("The withdrawed amount exceeds your current balance for account user: " + getId());
			System.exit(0);
		}
		else {
			balance -= withdraw;
		}
	}

	public void deposit(double deposit) {
		balance += deposit;
	}


}
