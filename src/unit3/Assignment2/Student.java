package unit3.Assignment2;

public class Student extends Person {
	
	private final String classStatus;

	public String getClassStatus() {
		return classStatus;
	}

	/**
	 * @param name
	 * @param address
	 * @param phoneNumber
	 * @param emailAddress
	 * @param classStatus
	 */
	public Student(Name name, Address address, String phoneNumber, String emailAddress, String classStatus) {
		super(name, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + ", Class: " + this.getClass().getName();
	}
	
}
