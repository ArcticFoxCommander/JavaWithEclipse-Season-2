package unit3.Assignment1;

public class CommissionEmployee extends Employee{

	private double grossSale;
	private double commissionRate;
	
	/**
	 * @param name
	 * @param SSN
	 * @param grossSale
	 * @param commissionRate
	 */
	public CommissionEmployee(Name name, String SSN, Address address, double grossSale, double commissionRate) {
		super(name, SSN, address);
		if (grossSale < 0) {
			System.out.println("Gross Sale must be on or above 0. Try again.");
			System.exit(0);
		}
		else {
			this.grossSale = grossSale;
		}
		if (commissionRate < 0.00 || commissionRate > 1.00) {
			System.out.println("Commission Rate must between 0.01 - 0.99. Try again.");
			System.exit(0);
		}
		else {
			this.commissionRate = commissionRate;
		}
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the grossSale
	 */
	public double getGrossSale() {
		return grossSale;
	}

	/**
	 * @param grossSale the grossSale to set
	 */
	public void setGrossSale(double grossSale) {
		if (grossSale < 0) {
			System.out.println("Gross Sale must be on or above 0. Try again.");
			System.exit(0);
		}
		else {
			this.grossSale = grossSale;
		}
	}

	/**
	 * @return the commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate < 0.00 || commissionRate > 1.00) {
			System.out.println("Commission Rate must between 0.01 - 0.99. Try again.");
			System.exit(0);
		}
		else {
			this.commissionRate = commissionRate;
		}
	}
	
	/**
	 * @return the earnings
	 */
	public double earnings() {
		return (grossSale * commissionRate);
	}


	@Override
	public String toString() {
		return String.format("CommissionEmployee [grossSale=%.2f, commissionRate=%.2f, earnings=%.2f, %ntoString()=%s]",
				grossSale, commissionRate, earnings(), super.toString());
	}


	
	
	
	
}
