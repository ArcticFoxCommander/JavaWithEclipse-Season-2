package unit4.Excercise1;

import java.util.Random;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		Random random = new Random();
		int [] array = new int [100];
		int n = 0;
		
		for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2147483647);
        }
		
		System.out.print("Enter an index of the array: ");
		n = input.nextInt();
			
			try {
				int element = array[n];
				System.out.printf("The random number at index #%s is %s", n, element);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of Bounds, try again: ");
				
			}
		
			input.close();
	}

}
