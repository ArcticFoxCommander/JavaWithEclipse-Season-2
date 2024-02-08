package unit1.Excercise1;

class Stock {

	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	double priceChangePercentage;
	
	Stock() {
		
		symbol = null;
		name = null;
		previousClosingPrice = 0;
		currentPrice = 0;
	}
	
	Stock(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice) {
		
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newPreviousClosingPrice;
		currentPrice = newCurrentPrice;
		
	}
	
	String getSymbol() {
		return symbol;
	}
	
	String getName() {
		return name;
	}
	
	double previousClosingPrice() {
		return previousClosingPrice;
	}
	
	double currentPrice() {
		return currentPrice;
	}
	
	// How to calculate?
	
	double priceChangePercentage() {
		return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;
	}
	
}
