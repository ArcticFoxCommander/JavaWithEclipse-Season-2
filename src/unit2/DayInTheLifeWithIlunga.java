package unit2;

import java.util.Random;

public class DayInTheLifeWithIlunga {
    public static void main(String[] args) {
        System.out.println("Welcome to a Day in the Life of Himnish Teotia with Mr. Ilunga!");

        for (int day = 1; day <= 3; day++) {
            System.out.println("\nDay " + day + ":");

            javaClass(day);
        }

        System.out.println("\nEnd of the Day in the Life simulation with Mr. Ilunga.");
    }

    public static void javaClass(int day) {
        Random random = new Random();
        String[] responses = {"it ok?", "uno", "it ok uno?"};

        System.out.println("Computer Programming 12 with Mr. Ilunga:");
        System.out.println("Mr. Ilunga stares at you while saying \"" + responses[random.nextInt(responses.length)] + "\"");

        int quizScore = random.nextInt(66) - 45; // Random score between -45 to 20 out of 45
        System.out.println("You score " + quizScore + " out of 45 in the quiz.");

        if (quizScore < 20) {
            System.out.println("Mr. Ilunga assigns additional exercises due at 6pm tonight.");
        }

        if (day == 1 || day == 3) {
            System.out.println("Mr. Ilunga asks you to stay after school for additional help.");
        } else {
            System.out.println("Mr. Ilunga pulls you into lunchtime to work on Java exercises.");
        }
    }
}