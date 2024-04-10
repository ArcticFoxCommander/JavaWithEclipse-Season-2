package unit3.Assignment1;

public class Name {
	private final String firstName;
	private final String middleName;
	private final String lastName;

	public Name(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}


}
