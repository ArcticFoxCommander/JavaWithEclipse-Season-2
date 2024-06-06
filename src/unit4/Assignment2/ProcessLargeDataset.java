package unit4.Assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessLargeDataset {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File files = new File("Salary.txt"); // NAME OF THE FILE HERE. 1000 is salary.txt file.

		double totalAssistantProfessors = 0.0;
		double totalAssociateProfessors = 0.0;
		double totalFullTimeProfessors = 0.0;

		double averageAssistantProfessors = 0.0;
		double averageAssociateProfessors = 0.0;
		double averageFullTimeProfessors = 0.0;

		int tap = 0; // Num AP
		int tasp = 0; //  Num AP
		int tfp = 0; // NUM FTP

		ArrayList<Faculty> facultyList = new ArrayList<>();

		try (
				// Create a Scanner for the file
				Scanner input = new Scanner(files);
				) {

			while (input.hasNext()) {
				String first = "";
				String last = "";
				String rank = "";
				Double salary = 0.0;

				try {
					first = input.next();
					last = input.next();
					rank = input.next();
					salary = input.nextDouble();
				} 
				catch (InputMismatchException e) {
					System.out.println("Error with DATA included! Line skipped.");
					input.nextLine();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				if (rank.equals("assistant")) {
					totalAssistantProfessors += salary;
					tap++;
				}
				if (rank.equals("associate")) {
					totalAssociateProfessors += salary;
					tasp++;
				}
				if (rank.equals("full")) {
					totalFullTimeProfessors += salary;
					tfp++;
				}
				Faculty faculty = new Faculty(first, last, rank, salary);
				facultyList.add(faculty);
				continue;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File was not found. " + e.getMessage());
			return;
		}
		double totalSalary = totalAssistantProfessors+totalAssociateProfessors+totalFullTimeProfessors;
		averageAssistantProfessors = totalAssistantProfessors/tap;
		averageAssociateProfessors = totalAssociateProfessors/tasp;
		averageFullTimeProfessors = totalFullTimeProfessors/tfp;
		double totalAverage = averageAssistantProfessors+averageAssociateProfessors+averageFullTimeProfessors;
		int totalFaculty = tap+tasp+tfp;
		System.out.printf("Java University Faculty Salaries & Faculty Count%n%n--Total Salaries--%nAssistant Professors: $%.2f%nAssociate Professors: $%.2f%nFull Professors: $%.2f%nAll Faculty: $%.2f%n%n--Total Averages--%nAssistant Professors: $%.2f%nAssociate Professors: $%.2f%nFull Professors: $%.2f%nAll Faculty: $%.2f%n%n--Total Faculty--%nAssistant Professors: %s%nAssociate Professors: %s%nFull Professors: %s%nAll Faculty: %s%n", totalAssistantProfessors, totalAssociateProfessors, totalFullTimeProfessors, totalSalary, averageAssistantProfessors, averageAssociateProfessors, averageFullTimeProfessors, totalAverage, tap, tasp, tfp, totalFaculty);

	}

}

