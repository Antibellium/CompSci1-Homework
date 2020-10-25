package ThisPackage;
import java.util.Random;
public class Problem3 {
    // Revise Problem2 to run 10,000 times and display the number of winning games.
    public static void main(String[] args) {
        int playAgain = 0;
        int totalWins = 0;
        System.out.println("Let's play Craps 10,000 times and find out the probability of winning the game.");

        while (playAgain < 10_000) {
            totalWins = crapsGame(totalWins);
            ++playAgain;
        }
        int totalLosses = 10_000 - totalWins;

        System.out.print("After 10,000 games, there are " + (totalLosses) + " losses and " +
                (totalWins) + " wins.\nOdds of losing: " + (totalLosses / 100.00) + "%\nOdds of winning: " + (totalWins / 100.00) + "%");
    }

    public static int crapsGame(int totalWins) {
        Random rand = new Random();
        int die1 = rand.nextInt(6);
        die1++;
        int die2 = rand.nextInt(6);
        die2++;
        int diceSum = die1 + die2;

        if (diceSum == 7 || diceSum == 11) {
            ++totalWins;
        }
        else if (3 < diceSum && diceSum < 11) {
            int endGame = 0;

            while (endGame == 0) {
                int die3 = rand.nextInt(6);
                die3++;
                int die4 = rand.nextInt(6);
                die4++;
                int diceSum2 = die3 + die4;

                if (diceSum2 == diceSum) {
                    ++endGame;
                    ++totalWins;
                }
                else if (diceSum2 == 7)
                    ++endGame;
            }
        }
        return totalWins;
    }
}