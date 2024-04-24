package unit3.Assignment3;

public class Address {
	private String streetName;
	private String city;
	private String province;
	private String postalCode;
	
	public Address(String streetName, String city, String province, String postalCode) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}

	public String getPostalCode() {
		return postalCode;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", province=" + province + ", postalCode="
				+ postalCode + "]";
	}
	
	
}
