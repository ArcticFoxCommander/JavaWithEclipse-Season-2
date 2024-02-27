package unit1.Excercise4;

public class Stock {

		private String symbol;
		private String name;
		private double previousClosingPrice;
		private double currentPrice;
		double priceChangePercentage;
		
		Stock() {
			this("", "", 0, 0);
		}
		
		Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
			
			this.symbol = symbol;
			this.name = name;
			this.previousClosingPrice = previousClosingPrice;
			this.currentPrice = currentPrice;
			
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
	
