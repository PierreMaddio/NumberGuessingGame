import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        boolean playerGuessedCorrectly = false;

        int tryCount = 0;
        while (!playerGuessedCorrectly) {
            System.out.println("Enter your guess (1-100):");

            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct, you win!");
                System.out.println("It takes to you: " + tryCount + " tries");
                playerGuessedCorrectly = true;
            }
            else if (randomNumber > playerGuess) {
                System.out.println("Nope, the number is higher");
            }
            else {
                System.out.println("Nope, the number is lower");
            }
        }
        scanner.close();
    }
}