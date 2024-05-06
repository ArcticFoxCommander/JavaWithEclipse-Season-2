package unit3.Excercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an ArrayList to store the input sequence of numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Read numbers from the user until 0 is entered
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers ending with 0:");
        int input;
        do {
            input = scanner.nextInt();
            numbers.add(input);
        } while (input != 0);

        // Find the maximum number in the list
        Integer maxNumber = max(numbers);

        // Display the result
        if (maxNumber != null) {
            System.out.println("The maximum number in the list is: " + maxNumber);
        } else {
            System.out.println("The list is null or empty.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to find the maximum value in an ArrayList of integers
    public static Integer max(ArrayList<Integer> list) {
        // Check if the list is null or empty
        if (list == null || list.isEmpty()) {
            return null;
        }

        // Initialize maxNumber with the first element of the list
        Integer maxNumber = list.get(0);

        // Iterate through the list to find the maximum number
        for (Integer number : list) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }
}