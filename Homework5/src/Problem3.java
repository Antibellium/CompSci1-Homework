import java.util.Random;
public class Problem3 {
    public static void main(String[] args) {
        // Write a program that simulates flipping a coin one million times and displays the number of heads and tails.
        Random rand = new Random();
        int totalFlips = 0;
        int totalHeads = 0;
        int totalTails = 0;

        while (totalFlips < 1_000_000){
            int coinFlip = rand.nextInt(2);
            if (coinFlip == 0)
                totalHeads++;
            else
                totalTails++;
            totalFlips++;
        }
        System.out.println
                ("After 1,000,000 coin flips, the results are:" +
                        "\nHeads: " + totalHeads + "\nTails: " + totalTails);
        double percentHeads = (totalHeads / 10_000.0);
        double percentTails = (totalTails / 10_000.0);
        System.out.print
                ("Percentage of heads: " + percentHeads +
                        " %\nPercentage of tails: " + percentTails + " %");
    }
}
