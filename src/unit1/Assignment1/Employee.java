package unit1.Assignment1;

public class Employee {

	private String firstName = "Employee Default First_Name";
	private String lastName = "Employee Default Last_Name";
	private double monthlySalary = 0;
	
	Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setMonthlySalary(double newMonthlySalary) {
		if (monthlySalary < 0)
			monthlySalary = 0;

		monthlySalary = newMonthlySalary;
	}
	
	public double setYearlySalary() {
		return (monthlySalary * 12);
	}
	
	public double setYearlySalaryWithTenPercentRaise() {
		return (monthlySalary * 12) * 1.1;
	}
	
	public String toString() {
		if (monthlySalary < 0) {
			monthlySalary = 0;
		}
		return "Payroll System \n" + "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Monthly Salary: $" + monthlySalary + "\n" + "Yearly Salary: $";
	}
	
}
