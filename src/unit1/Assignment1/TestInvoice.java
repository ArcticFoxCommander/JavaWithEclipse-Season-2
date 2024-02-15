package unit1.Assignment1;

public class TestInvoice {

	public static void main(String[] args) {
	Invoice invoice1 = new Invoice();
	invoice1.partNumber = "4891";
	invoice1.partDescription = "Computer";
	invoice1.quantity = 30;
	invoice1.pricePerItem = 499.99;
	System.out.println(invoice1.toString());
	Invoice invoice2 = new Invoice();
	invoice2.partNumber = "4021";
	invoice2.partDescription = "Monitor";
	invoice2.quantity = 30;
	invoice2.pricePerItem = 129.99;
	System.out.println(invoice2.toString());
	}

}
