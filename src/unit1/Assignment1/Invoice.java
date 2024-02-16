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
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int newQuantity) {
		if (newQuantity < 0) {
			newQuantity = 0;
		}
		quantity = newQuantity;
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	public void setPricePerItem(double newPricePerItem) {
		if (newPricePerItem < 0) {
			newPricePerItem = 0.0;
		}
		pricePerItem = newPricePerItem;
	}
	
	public double setInvoiceAmount() {
		return quantity * pricePerItem;
	}
	
	public String toString() {
		if (quantity < 0) {
			quantity = 0;
		}
		if (pricePerItem < 0.0) {
			pricePerItem = 0.0;
		}
		return "The JAVA Hardware Store - Invoice System" + "\n" + "Part Number: " + partNumber + "\n" + "Part Description: " + partDescription + "\n" + "Quantity: " + quantity + "\n" + "Price Per Item: $" + pricePerItem + "\n" + "Invoice Amount: $";
	}
}
