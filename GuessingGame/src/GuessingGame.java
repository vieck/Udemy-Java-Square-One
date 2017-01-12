import java.util.Scanner;

/**
 * Created by mvieck on 12/28/16.
 */
public class GuessingGame {

    int number;

    private void generateGuess() {
        this.number = 1 + (int)(Math.random() * 100);
    }

    private void welcome() {
        System.out.println("Welcome to the Guessing Game!!!");
        System.out.println("To begin, guess a number between 1 and 100.");
    }

    public void guess() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("Guess too low, number is larger");
            } else if (guess > number) {
                System.out.println("Guess too high, number is smaller");
            } else {
                System.out.println("You guessed correctly!!!");
                break;
            }
        }
        replay(scanner);
    }

    private void start() {
        generateGuess();
        welcome();
        guess();
    }

    private void replay(Scanner scanner) {
        System.out.println("Play again? Y/N ");
        String replay = scanner.next();
        if (replay.matches("Y") || replay.matches("y")) {
            start();
        } else if (replay.matches("N") || replay.matches("n")) {
            System.out.println("Thanks for playing!");
            return;
        }
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.start();
    }
}
