package unit2;

import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious forest.");

        System.out.println("You see two paths ahead of you. Do you take the left path or the right path?");
        System.out.print("Enter 'left' or 'right': ");
        choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("left")) {
            System.out.println("You encounter a river blocking your path.");
            System.out.println("Do you attempt to swim across or look for a bridge?");
            System.out.print("Enter 'swim' or 'bridge': ");
            choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("swim")) {
                System.out.println("You try to swim across the river but are caught in a strong current and drown. Game Over!");
            } else if (choice.equals("bridge")) {
                System.out.println("You find a hidden bridge and safely cross the river.");
                System.out.println("You continue on your journey.");
                // Continue with more story...
            } else {
                System.out.println("Invalid choice. Game Over!");
            }
        } else if (choice.equals("right")) {
            System.out.println("You come across a treasure chest.");
            System.out.println("Do you open the treasure chest or leave it?");
            System.out.print("Enter 'open' or 'leave': ");
            choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("open")) {
                System.out.println("You open the treasure chest and find gold coins. Congratulations, you win!");
            } else if (choice.equals("leave")) {
                System.out.println("You decide to leave the treasure chest and continue exploring the forest.");
                // Continue with more story...
            } else {
                System.out.println("Invalid choice. Game Over!");
            }
        } else {
            System.out.println("Invalid choice. Game Over!");
        }

        scanner.close();
    }
}