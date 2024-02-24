package unit1.Assignment3;

public class TestLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = input.nextInt();
		System.out.println("Enter the number of columns: ");
		int column = input.nextInt();
		
		double[][] array = new double[row][column];
		
		System.out.println("Enter the array for " + row + " rows and " + column + " columns.");
		for (int a = 0; a < row; a++) {
			for (int b = 0; b < column; b++) {
				array[a][b] = input.nextDouble();
			}
		}
		
		Location find = Location.locateLargest(array);
		
		System.out.println("The location of the largest element is " + find.maxValue + " at " + find.row + " , " + find.column);
		
		
		input.close();
	}

}
