package unit1.Assignment4;


public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account user = new Account(1122, 20000, 4.5); {
			
		}
		double withdraw = 2500; user.withdraw(withdraw);
		double deposit = 3000; user.deposit(deposit);
		
		System.out.printf("__________________________________%n%n"
							+ "Welcome to your JAVA Bank Account%n"
						    + "Date: %s%nID: %s%n"
						    + "__________________________________%n%n"
						    + "Monthly Interest: $%.2f%n"
							+ "Today you withdrew: $%.2f%n"
							+ "Today you deposited: $%.2f%n"
							+ "New Balance: $%.2f"
							+ "%n__________________________________", user.dateCreated(), user.getId(), user.getMonthlyInterest(), withdraw, deposit, user.getBalance());
		}
	}


