package unit1.Assignment3;

public class Location {

	public int row = 0;
	public int column = 0;
	public double maxValue = 0;

	Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	// e = row, and f = column
	
	public static Location locateLargest(double[][] a) {
		
		int maxRow =0;
		int maxColumn = 0;
		double maxValue = a[0][0];
		
		for (int e = 0; e < a.length; e++) {
			for (int f = 0; f < a[e].length; f++) {
				if (a[e][f] > maxValue) {
					maxValue = a[e][f];
					maxRow = e;
					maxColumn = f;
				}
			}
		}
		return new Location(maxRow, maxColumn, maxValue);
	}
	
}
