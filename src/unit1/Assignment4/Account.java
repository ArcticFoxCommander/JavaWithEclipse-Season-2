package unit1.Assignment4;

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account() {
		this(0, 0.0);
	}

	Account(int id, double balance) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
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
	
	void setAnnualInterestRate(double e) {
		annualInterestRate = e;
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	double getMonthlyInterest() {

		return getBalance() * (annualInterestRate / 1200);	
	}

	public void withdraw(double withdraw) {
		if (withdraw > balance) {
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
