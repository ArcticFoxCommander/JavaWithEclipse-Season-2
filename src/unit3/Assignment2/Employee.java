package unit3.Assignment2;

public class Employee extends Person {

	private String office;
	private double salary;
	private Date date;

	/**
	 * @param name
	 * @param address
	 * @param phoneNumber
	 * @param emailAddress
	 * @param office
	 * @param salary
	 * @param date
	 */
	public Employee(Name name, Address address, String phoneNumber, String emailAddress, String office, double salary,
			Date date) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.date = date;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + ", Class: " + this.getClass().getName();
	}

}
