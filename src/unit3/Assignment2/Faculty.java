package unit3.Assignment2;

public class Faculty extends Employee {
	
	private String officeHours;
	private String rank;
	/**
	 * @param officeHours
	 * @param rank
	 */
	public Faculty(String officeHours, String rank, Name name, Address address, String phoneNumber, String emailAddress, String office, double salary,
			Date date) {
		super(name, address, phoneNumber, emailAddress, office, salary, date);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + ", Class: " + this.getClass().getName();
	}
}
