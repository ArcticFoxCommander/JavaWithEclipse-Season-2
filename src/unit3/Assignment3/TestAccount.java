package unit3.Assignment3;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1 = new Account(1, new Name("Strong", "Java", "Coffee"), new Address("2300 Oracle Way", "Austin", "Texas", "78741"), 100, 4.5);
		ChequingsAccount account3 = new ChequingsAccount(2, new Name("Loïck", "Charmander", "Me"), new Address("9 Rue Nicolas Meyers", "Bascharge Käerjeng", "Luxembourg", "4918"), 100, 4.5, 800);
		SavingsAccount account2 = new SavingsAccount(3, new Name("Conos", "The", "Rock"), new Address("1951 Silver Springs Pkwy", "Henderson", "nevada", "89074"), 898000, 4.5);
		System.out.println(account1.toString() + "\n");
		System.out.println(account3.toString() + "\n");
		System.out.println(account2.toString() + "\n");
	}

}
