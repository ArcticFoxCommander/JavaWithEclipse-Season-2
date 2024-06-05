package unit3;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        int totalPointsLost = 0;

        System.out.println("Welcome to Rock, Paper, Scissors game! If you lose, a random amount of points is lost on your next quiz and project.");

        while (true) {
            System.out.print("Enter your choice (Rock, Paper, Scissors) or 'quit' to exit: ");
            String playerChoice = scanner.nextLine().trim().toLowerCase();

            if (playerChoice.equals("quit")) {
                System.out.println("Thanks for playing! Total points lost: " + totalPointsLost);
                break;
            }

            if (!isValidChoice(playerChoice)) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("IlungaComputer chooses: " + computerChoice);

            String result = determineWinner(playerChoice, computerChoice);
            System.out.println(result);

            if (result.equals("IlungaComputer wins!")) {
                int pointsLost = random.nextInt(16) + 5; // Random points between -5 and -20
                System.out.println("You lost " + pointsLost + " points on the next quiz and project.");
                totalPointsLost += pointsLost;
            }
        }

        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "You win!";
        } else {
            return "IlungaComputer wins!";
        }
    }
}