import java.util.Scanner;
import java.util.Random;
public class Problem2 {
    public void main() {
        // Coin Flip Game
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        System.out.println("Welcome to the Coin Flip Game!\nPlease enter '1' for heads or '2' for tails.");

        int userChoice = input.nextInt();
        int coinFlip = rand.nextInt(2);
        coinFlip++;

        if (userChoice == 1) {
            System.out.println("You choose heads.");
            if (userChoice == coinFlip)
                System.out.println("The coin shows heads. You win!");
            else
                System.out.println("The coin shows tails. You lose.");
        }
        if (userChoice == 2) {
            System.out.println("You choose tails.");
            if (userChoice == coinFlip)
                System.out.println("The coin shows tails. You win!");
            else
                System.out.println("The coin shows heads. You lose.");
        }
    }
}
