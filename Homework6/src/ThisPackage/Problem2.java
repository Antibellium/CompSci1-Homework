package ThisPackage;
import java.util.Scanner;
import java.util.Random;
public class Problem2 {
    // (Game: craps) Craps is a popular dice game played in casinos. Write a program to play a variation of the game.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playAgain = 0;
        int money = 100;
        System.out.println("Welcome to Craps! Let's roll some dice!");

        while (playAgain < 2) {
            money = intro(money, input);
            System.out.println("\nEnter '1' to play again. Enter '2' to quit.");
            playAgain = input.nextInt();
        }
        System.out.print("See you later!");
    }
    public static int intro(int money, Scanner input) {
        System.out.println("Place your bet. 0 for lose, 1 for win.");
        int bet = input.nextInt();
        int point = 0; point = come0utRoll(point);
        if (point > 0)
            point = pointRoll(point);

        if (-1 == point && bet == 0) {
            System.out.print("You lost Craps and you won the bet.");
            money += 10;
        }
        return money;
    }
    public static int come0utRoll(int point) {
        Random rand = new Random();
        int die1 = rand.nextInt(6);
        die1++;
        int die2 = rand.nextInt(6);
        die2++;
        int diceSum = die1 + die2;

        if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + diceSum + ". Craps! You lose.");
            point = -1;
        }
        else if (diceSum == 7 || diceSum == 11) {
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + diceSum + ". Natural! You win!");
        }
        else {
            point = diceSum;
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + diceSum +
                    ". Your point is " + point + ". Let's roll again.");
        }
        return point;
    }

    public static int pointRoll(int point) {
        Random rand = new Random();
        int endGame = 0;

        while (endGame == 0) {
            int die1 = rand.nextInt(6);
            die1++;
            int die2 = rand.nextInt(6);
            die2++;
            int diceSum = die1 + die2;

            if (diceSum == point) {
                System.out.println
                        ("You rolled " + die1 + " + " + die2 + " = " + diceSum + ", which is your point! You win!");
                ++endGame;
            }
            else if (diceSum == 7) {
                System.out.println("You rolled " + die1 + " + " + die2 + " = " + diceSum + ". You lose.");
                point = -1;
                ++endGame;
            }
            else
                System.out.println("You rolled " + die1 + " + " + die2 + " = " + diceSum + ". Let's roll again.");
        }
        return point;
    }
}
