import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numberToGuess = random.nextInt(100);
        int maxchances=8;
        int numberOfTries = 0;
        int guess;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!!!");
        System.out.println("you have about "+maxchances+" chances to win the game");
        
        while (numberOfTries<maxchances) {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You Won it. You guessed the number in " + numberOfTries + " tries.");
                break;
            }
        }
        if(!hasGuessedCorrectly){
        System.out.println("Sorry, you have used all the chances.The number is "+numberToGuess+".");
        }
        scanner.close();
    }
}