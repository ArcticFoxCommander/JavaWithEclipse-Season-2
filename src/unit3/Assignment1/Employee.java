package unit3.Assignment1;

public class Employee {

	private final Name name;
	private final String SSN;
	private final Address address;


	public Employee(Name name, String SSN, Address address) {
		this.name = name;
		this.SSN = SSN;
		this.address = address;
	}


	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}


	/**
	 * @return the sSN
	 */
	public String getSSN() {
		return SSN;
	}


	public Address getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", SSN=" + SSN + ", address=" + address + "]";
	}


	

}
