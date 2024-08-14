import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int MAX_ATTEMPTS = 10;
        int totalRounds = 0;
        int roundsWon = 0;

        while (true) {
           
            int targetNumber = random.nextInt(100) + 1;
            int attemptsLeft = MAX_ATTEMPTS;
            boolean isGuessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it.");

            
            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    isGuessedCorrectly = true;
                    break;
                }

                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }

            
            if (isGuessedCorrectly) {
                System.out.println("Congratulations! You guessed the number correctly.");
                roundsWon++;
            } else {
                System.out.println("Sorry, you've used all your attempts. The number was: " + targetNumber);
            }

            totalRounds++;
            System.out.println("Rounds played: " + totalRounds);
            System.out.println("Rounds won: " + roundsWon);

            // Ask if the user wants to play another round
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing! Your final score is:");
        System.out.println("Rounds played: " + totalRounds);
        System.out.println("Rounds won: " + roundsWon);
        scanner.close();
    }
}
