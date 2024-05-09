package unit3.Assignment4;

import java.util.Date;

public class Transaction {
	
	private Date date = new Date();
	private char transactionType;
	private double amount;
	private double balance;
	private String description;
	/**
	 * @param transactionType
	 * @param amount
	 * @param balance
	 * @param description
	 */
	public Transaction(char transactionType, double amount, double balance, String description) {
		this.transactionType = transactionType;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public char getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(char transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
