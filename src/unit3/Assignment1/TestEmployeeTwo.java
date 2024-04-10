package unit3.Assignment1;

public class TestEmployeeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommissionEmployee employee = new CommissionEmployee(new Name("Real", "2", "Two"), "4432943948",  new Address("8255 Wayne St.", "Charleston", "South Carolina", "29406"), 4000, 0.02);

		System.out.printf("Employee Information: %n%nFirst Name: %s%nMiddle Name: %s%nLast Name: %s%nAddress: %s%nSSN: %s%nGross Sale: %.2f%nCommission Rate: %.2f%n Earnings: %.2f%n", employee.getName().getFirstName(), employee.getName().getMiddleName(), employee.getName().getLastName(), employee.getAddress(), employee.getSSN(), employee.getGrossSale(), employee.getCommissionRate(), employee.earnings()); 
		employee.setCommissionRate(0.02);
		employee.setGrossSale(0);
		System.out.println("Updated employee information obtained by toString: \n");
		System.out.println(employee.toString());
	}

}