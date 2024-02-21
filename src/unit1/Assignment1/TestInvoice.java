package unit1.Assignment1;

public class TestInvoice {

	public static void main(String[] args) {
	Invoice invoice1 = new Invoice("4891", "Computer", 30, 499.99);
	System.out.printf(invoice1.toString() + "%.2f \n\n", invoice1.setInvoiceAmount());
	Invoice invoice2 = new Invoice("4021", "Monitor", 25, 129.99);
	System.out.printf(invoice2.toString() + "%.2f \n\n", invoice2.setInvoiceAmount());
	}

}
