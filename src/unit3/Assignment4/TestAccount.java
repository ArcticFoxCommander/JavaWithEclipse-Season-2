package unit3.Assignment4;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1 = new Account(1122, new Name("George", "", ""), new Address("5601 Stanley Park Dr", "Vancouver", "British Columbia", "V6G 3E2"), 1000, 1.5);
		account1.deposit(30);
		account1.deposit(40);
		account1.deposit(50);
		account1.withdraw(5);
		account1.withdraw(4);
		account1.withdraw(2);
		System.out.println(account1.toString());
	}

}
