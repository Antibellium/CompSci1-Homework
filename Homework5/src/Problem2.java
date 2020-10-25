import java.util.Scanner;
import java.util.Random;
public class Problem2 {
    public static void main(String[] args) {
        /* 5.34 (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that plays the
        scissor-rock-paper game. Revise the program to let the user continuously play until either the user
        or the computer wins more than two times than its opponent.
         */
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        int computerWins = 0;
        int userWins = 0;
        System.out.println("Welcome to the Rock-Paper-Scissors Game!\nToday, you are playing against the Computer." +
                "\n\nBest two out of three?\n");

        while (computerWins < 2 && userWins < 2) {
            System.out.println("Please enter '1' for rock, '2' for paper, or '3' for scissors.");
            int playerChoice = input.nextInt();
            int computerChoice = rand.nextInt(3);
            computerChoice++;

            switch (computerChoice) {
                case 1:
                    System.out.print("The computer is rock. "); break;
                case 2:
                    System.out.print("The computer is paper. "); break;
                case 3:
                    System.out.print("The computer is scissors. "); break;
            }

            switch (playerChoice) {
                case 1:
                    System.out.println("You are rock."); break;
                case 2:
                    System.out.println("You are paper."); break;
                case 3:
                    System.out.println("You are scissors."); break;
            }
            if (computerChoice == playerChoice) {
                System.out.println("It's a tie.");
                System.out.println("Computer: " + computerWins + "\nUser: " + userWins);
            }
            else {
                boolean win = (playerChoice == 1 && computerChoice == 3)
                        || (playerChoice == 2 && computerChoice == 1)
                        || (playerChoice == 3 && computerChoice == 2);
                if (win) {
                    System.out.println("One point for you!");
                    userWins++;
                    System.out.println("Computer: " + computerWins + "\nUser: " + userWins);
                }
                else {
                    System.out.println("That's one point for the computer.");
                    computerWins++;
                    System.out.println("Computer: " + computerWins + "\nUser: " + userWins);
                }
            }
        }
        if (userWins > computerWins)
            System.out.println("\nYou win!");
        else
            System.out.println("\nThe computer wins!");
    }
}
