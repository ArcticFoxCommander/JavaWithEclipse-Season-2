package unit3.Assignment4;

import java.util.Date;
import java.util.ArrayList;

public class Account {

	private int id;
	private Name name;
	private Address address;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;
	
	Account(int id, Name name, Address address, double balance, double annualInterestRate) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
		this.transactions = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Date dateCreated() {
		return getDateCreated();
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
		transactions.add(new Transaction('W', withdraw, balance, "Withdraw"));
	}	
}

	public void deposit(double deposit) {
		balance += deposit;
		transactions.add(new Transaction('D', deposit, balance, "Deposit"));
	}

	@Override
	public String toString() {
		String customerInfo = "Welcome to the Java ATM. Here are your recent transactions.%n"
							+ "===========================================================%n"
							+ "ID: %s%n"
							+ "Name: %s%n"
							+ "Balance: %.2f%n"
							+ "Annual Interest Rate: %.2f%n"
							+ "===========================================================%n"
							+ "Date                          Type  Amount       Balance%n";
		StringBuilder builder = new StringBuilder(); 
		for (Transaction transaction : transactions) {
			String formattedInfo = String.format("%-30s%-6s$%-12.2f$%.2f\n", transaction.getDate(), transaction.getTransactionType(), transaction.getAmount(), transaction.getBalance());
			builder.append(formattedInfo);
		}
		builder.append("===========================================================");
		return String.format(customerInfo, id, name, balance, annualInterestRate) + builder.toString();
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

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
}
