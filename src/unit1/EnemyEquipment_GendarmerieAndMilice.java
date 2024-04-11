package unit1;

import java.util.Scanner;

public class EnemyEquipment_GendarmerieAndMilice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	    System.out.print("Gendarmerie(1) or Milice(2): ");
	    int EF = input.nextInt();
	    String PEN = " ";
	    if (EF == 1) {
	    	PEN = "Gendarmerie";
	    }
	    else if (EF == 2) {
	    	PEN = "Milice";
	    }
	    else {
	    	System.out.println("Invalid input, try again.");
	    	input.close();
	    	return;
	    }
	    System.out.print("Soldier(1) or Officer(2): ");
	    int ET = input.nextInt(); 
	    String PET = " ";
	    if (ET < 1 || ET > 2) { 
	    	System.out.println("Invalid input, try again.");
	    	input.close();
	    	return;
	    }
	    if (ET == 1) {
	    	PET = "Soldier";
	    }
	    else if (EF == 2) {
	    	PET = "Officer";
	    }
	    System.out.print("Amount: " );
	    int EN = input.nextInt();
	    if (EN < 1) {
	    	System.out.println("Invalid input, try again.");
	    	input.close();
	    	return;
	    }
	    input.close();
	    for (int i = 0; i < EN; i++) {
	        GMM_EnemyTable enemyTable = new GMM_EnemyTable(ET);
	        String equipment = enemyTable.toString();
	        System.out.printf("%s %s: %s%n", PEN, PET, equipment);
	    }
	}

}
