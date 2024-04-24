package unit3.Assignment3;

public class Name {
	private final String firstName;
	private final String middleName;
	private final String lastName;

	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	

	@Override
	public String toString() {
		return String.format("Name [firstName=%s, middleName=%s, lastName=%s]", firstName, middleName,
				lastName);
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
