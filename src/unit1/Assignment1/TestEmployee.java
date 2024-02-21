package unit1.Assignment1;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee SSPE_FHSS308 = new Employee("Jason", "Davids", 5273.33);
		System.out.printf(SSPE_FHSS308.toString() + "%.2f \nYearly Salary With 10%% Bonus: $%.2f \n\n", SSPE_FHSS308.setYearlySalary(), SSPE_FHSS308.setYearlySalaryWithTenPercentRaise());
		
		Employee SSPE_FHSSOFF1 = new Employee("Simon", "Franklin", 6356.42);
		System.out.printf(SSPE_FHSSOFF1.toString() + "%.2f \nYearly Salary With 10%% Bonus: $%.2f \n\n", SSPE_FHSSOFF1.setYearlySalary(), SSPE_FHSSOFF1.setYearlySalaryWithTenPercentRaise());
	}

}
