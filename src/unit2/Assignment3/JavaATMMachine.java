package unit2.Assignment3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaATMMachine {

	private static Customer[] customers;
	private static Account[] accounts;
	private static Date dateCreated = new Date();

	public static void main(String[] args) {
		header(args);
		try {
			readingFiles1("accountfile.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readingFiles2("customerFile.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (Scanner input = new Scanner(System.in)) {
			int remainingTries = 3;
			while (remainingTries > 0) {
				System.out.print("Enter customer ID: ");
				int id = input.nextInt();

				Customer customer = mainMethodID(id);
				if (customer == null) {
					System.out.println("Invalid customer ID. You have " + (--remainingTries) + " tries remaining before you are asked to conduct your banking with a bank teller.");
					if (remainingTries == 0) {
						System.exit(0);
					}
					continue;
				}

				Account account = checkCustomerID(customer);
				mainMenuSelection(account, customer);
			}
		}
	}





	private static Customer mainMethodID(int id) {
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}

	public static Account checkCustomerID(Customer customer) {
		for (Account account : accounts) {
			if (account.getId() == customer.getId()) {
				return account;
			}
		}
		return null;
	}

	public static void mainMenuSelection(Account account, Customer customer) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.printf("== Hello %s %s ==%n>> %s <<%n== Main Menu ==%n%n1: Check Balance%n2: Withdraw%n3: Deposit%n4: Exit and Return Card%nEnter a choice: ", customer.getFirstName(), customer.getLastName(), account.dateCreated());
			int selection = input.nextInt();

			switch(selection) {
			default:
				System.out.printf("Invalid choice, try again.%n");
			case 1:
				System.out.printf("Your current balance is: %.2f%n", account.getBalance());
				break;
			case 2:
				System.out.printf("Enter desired withdrawal amount: ");
				double amount = input.nextDouble();
				account.withdraw(amount);
				System.out.println();
				break;
			case 3:
				System.out.printf("Enter desired deposit amount: ");
				double damount = input.nextDouble();
				account.deposit(damount);
				System.out.println();
				break;
			case 4:
				System.out.printf("Exiting... %nThank you %s for banking with our Java ATM%n%s%n", customer.getFirstName(), dateCreated);
				System.exit(0);
			}

		}

	}


	// Account File

	public static void readingFiles1(String FILE_NAME) throws Exception {
		Scanner input = new Scanner(new File(FILE_NAME));

		int numOfAccounts = 0;
		while (input.hasNextLine()) {
			numOfAccounts++;
			input.nextLine();
		}
		input.close();
		accounts = new Account[numOfAccounts];
		input = new Scanner(new File(FILE_NAME));
		while (input.hasNext()) {
			for (int l = 0; l < numOfAccounts; l++) {
				int id = input.nextInt();
				double balance = input.nextDouble();
				double annualInterestRate = input.nextDouble();
				String dateCreatedSS = input.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
				Date dateCreated = sdf.parse(dateCreatedSS);  
				accounts[l] = new Account(id, balance, annualInterestRate, dateCreated);
			}
		}
		input.close();

	}

	// Customer File

	public static void readingFiles2(String FILE_NAME) throws Exception {
		Scanner input = new Scanner(new File(FILE_NAME));

		while (input.hasNext()) {
			int numOfCustomers = input.nextInt();
			customers = new Customer[numOfCustomers];
			for (int i = 0; i < numOfCustomers; i++) {
				int id = input.nextInt();
				String firstName = input.next();
				String lastName = input.next();
				String dateCreatedSS = input.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
				Date dateCreated = sdf.parse(dateCreatedSS);  
				customers[i] = new Customer(id, firstName, lastName, dateCreated);
			}
		}
		input.close();
	}
	
	public static void header(String args[]) {
		System.out.println("*******************************************************");
		System.out.println("***                                                 ***");
		System.out.println("***Fox                                              ***");
		System.out.println("***Programming Exercise: 02                         ***");
		System.out.println("***Course: Java                                     ***");
		System.out.println("***                                                 ***");
		System.out.println("***Computer: Dell/Acer          IDE: Eclipse 2022-09***");
		System.out.println("***                                                 ***");
		System.out.println("***Code Finished: April 4th 2024 2:15AM             ***");
		System.out.println("***            Welcome to the Tofino ATM            ***");
		System.out.println("***            =========================            ***");
		System.out.println("*******************************************************");
	}
}


