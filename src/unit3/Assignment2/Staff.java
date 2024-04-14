package unit3.Assignment2;

public class Staff extends Employee {
	
	private String title;

	/**
	 * @param title
	 */
	public Staff(String title, Name name, Address address, String phoneNumber, String emailAddress, String office, double salary,
			Date date) {
		super(name, address, phoneNumber, emailAddress, office, salary, date);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + ", Class: " + this.getClass().getName();
	}
	
}
