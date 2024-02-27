package unit1.Excercise4;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock data = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		
		System.out.printf("The stock report is as follows: \nSymbol: %s\nName: %s\nPrevious Closing Price: %s\nCurrent Price: %s\nPrice-Change Percentage: %.2f%s", data.getSymbol(), data.getName(), data.previousClosingPrice(), data.currentPrice(), data.priceChangePercentage(), "%");
	}

}
