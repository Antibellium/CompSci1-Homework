import java.util.Scanner;
import java.util.Random;
public class Problem3 {
    public void main() {
        // Rock-Paper-Scissors Game
        Scanner input = new Scanner (System.in);
        Random rand = new Random(2);
        System.out.println("Welcome to the Rock-Paper-Scissors Game!\nToday, you are playing against the Computer." +
                "\nPlease enter '1' for rock, '2' for paper, or '3' for scissors.");
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
        if (computerChoice == playerChoice)
            System.out.print("It's a tie.");
        else {
            boolean win = (playerChoice == 1 && computerChoice == 3)
                       || (playerChoice == 2 && computerChoice == 1)
                       || (playerChoice == 3 && computerChoice == 2);
            if (win)
                System.out.print("You win!");
            else
                System.out.print("You lose.");
        }


    }
}
