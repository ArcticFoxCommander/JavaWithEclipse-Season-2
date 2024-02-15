package unit1.Assignment1;

class Invoice {

	public String partNumber = "0001";
	public String partDescription = "An item.";
	public int quantity = 0;
	public double pricePerItem = 0;
	public double invoiceAmount = 0;
	
	Invoice() {
		
		partNumber = "0001";
		partDescription = "An item.";
		quantity = 0;
		pricePerItem = 0;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartNumber(String newPartNumber) {
		partNumber = newPartNumber; 
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String newPartDescription) {
		partDescription = newPartDescription; 
	}
	
	public int setQuantity() {
		return quantity;
	}
	
	public void setQuantity(int newQuantity) {
		quantity = newQuantity;
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	public void setPricePerItem(double newPricePerItem) {
		pricePerItem = newPricePerItem;
	}
	
	public double setInvoiceAmount() {
		return invoiceAmount = quantity * pricePerItem;
	}
	
	public String toString() {
		return "The JAVA Hardware Store - Invoice System" + "\n" + "Part Number: " + partNumber + "\n" + "Part Description: " + partDescription + "\n" + "Quantity: " + quantity + "\n" + "Price Per Item: $" + pricePerItem + "\n" + "Invoice Amount: $" + setInvoiceAmount();
	}
}
