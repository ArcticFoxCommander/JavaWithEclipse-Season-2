package unit1.Assignment4;

public class TestAiAccount {
    public static void main(String[] args) {
        // Create an Account object
    	
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter your ID: ");
        int id = input.nextInt();

        System.out.println("Enter your balance: ");
        double balance = input.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
    	
        System.out.println("How much would you like to withdraw? (Input 0 to skip): ");
        double withdraw = input.nextDouble();
        
        System.out.println("How much would you like to deposit? (Input 0 to skip): ");
        double deposit = input.nextDouble();
        
        AiAccount account = new AiAccount(id, balance);

        // Set annual interest rate to 4.5%
        account.setAnnualInterestRate(annualInterestRate);

        // Withdraw $2,500
        account.withdraw(withdraw);

        // Deposit $3,000
        account.deposit(deposit);

        // Print balance, monthly interest, and date created
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}

