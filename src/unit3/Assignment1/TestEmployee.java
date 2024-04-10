package unit3.Assignment1;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Input the Employee's name (First Middle Last): ");
		String fn = input.next();
		String mn = input.next();
		String ln = input.nextLine();
		
		System.out.print("Input the Employee's street: ");
		String st = input.nextLine();
		System.out.print("Input the Employee's city: ");
		String c = input.nextLine();
		System.out.print("Input the Employee's province: ");
		String p = input.nextLine();
		System.out.print("Input the Employee's postal code: ");
		String pc = input.nextLine();
		
		System.out.print("Input the Employee's social security number: ");
		String ssn = input.next();
		
		System.out.print("Input the Employee's gross sales: ");
		double gs = input.nextDouble();
		System.out.print("Input the Employee's commission rate (0.01-0.99): ");
		double cr = input.nextDouble();
		
		if (cr < 0 || cr > 0.99) {
			System.out.print("The commission rate must be between 0.01 and 0.99. Try again.");
			System.exit(0);
		}
		
		input.close();
		
		Name employeeName = new Name(fn, mn, ln);
		Address address = new Address(st, c, p, pc);
		CommissionEmployee employee1 = new CommissionEmployee(employeeName, ssn, address, gs, cr);
		employee1.setCommissionRate(0.10);
		employee1.setGrossSale(5000.00);
		System.out.printf("Employee Information: %n%nFirst Name: %s%nMiddle Name: %s%nLast Name: %s%nAddress: %s, %s, %s %s%nSocial Secuirty Number: %s%nGross Sales Made: %.2f%nCommission Rate: %.2f%nEarnings: $%.2f%n%nUpdated Employee Information: %n%n%s", employee1.getName().getFirstName(), employee1.getName().getMiddleName(), employee1.getName().getLastName(), employee1.getAddress().getStreetName(), employee1.getAddress().getCity(), employee1.getAddress().getProvince(), employee1.getAddress().getPostalCode(), employee1.getSSN(), employee1.getGrossSale(), employee1.getCommissionRate(), employee1.getEarnings(), employee1.toString());
	}

}
