package ThisPackage;
import java.util.Scanner;
public class Problem3 {
/** 7.37 (Game: bean machine) The bean machine, also known as a quincunx or the Galton box,
 * is a device for statistics experiments named after English scientist Sir Francis Galton.
 *
 * It consists of an upright board with evenly spaced nails (or pegs) in a triangular form.
 * Balls are dropped from the opening of the board.
 * Every time a ball hits a nail, it has a 50% chance of falling to the left or to the right.
 * The piles of balls are accumulated in the slots at the bottom of the board.
 *
 * Write a program that simulates the bean machine.
 * Your program should prompt the user to enter the number of the balls and the number of the slots in the machine.
 * Simulate the falling of each ball by printing its path.
 * Display the final buildup of the balls in the slots in a histogram.
 * Here is a sample run of the program:
    Enter the number of balls to drop: 5
    Enter the number of slots in the bean machine: 8
    LRLRLRR;
    RRLLLRR;
    LLRLLRR;
    RRLLLLL;
    LRLRRLR;
    O; O; OOO
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of balls.");
        int num0fBalls = input.nextInt();
        System.out.println("Enter number of slots.");
        int num0fSlots = input.nextInt();

        String[] ballPaths = new String[num0fBalls];
        int[] slots = new int[num0fSlots];

        beanMachine(ballPaths, slots);
        printHistogram(ballPaths, slots);

    }

    public static void printHistogram(String[] ballPaths, int[] slots) {
        int max = getMax(slots);
        for (int line = 0; line < max; line++){
            int i = 0;
            System.out.print("\n|");
            do {
                if (i < 9) {
                    if (slots[i] >= (max - line))
                        System.out.print("o|");
                    else
                        System.out.print(" |");
                }
                else {
                    if (slots[i] >= (max - line))
                        System.out.print("o |");
                    else
                        System.out.print("  |");
                }
                i++;
            } while (i < slots.length);
            System.out.print(max - line);
        }
        System.out.print("\n ");
        for (int i = 1; i <= slots.length; i++)
                System.out.print(i + " ");
    }

    private static int getMax(int[] slots) {
        int max = slots[0];
        for(int i = 1; i < slots.length; i++) {
            if(slots[i] > max)
                max = slots[i];
        }
        return max;
    }


    public static void beanMachine(String[] ballPaths, int[] slots) {
        for (int i = 0; i < ballPaths.length; i++) {
            ballPaths[i] = "";
            int pegs = 0;
            int rightTurns = 0;
            do {
                int left0rRight = (int) (Math.random() * 2);
                switch (left0rRight) {
                    case 0:
                        ballPaths[i] += "L";
                        break;
                    case 1:
                        ballPaths[i] += "R";
                        rightTurns++;
                        break;
                }
                pegs++;
            } while (pegs < slots.length - 1);
            System.out.println(ballPaths[i]);
            slots[rightTurns]++;
        }
    }
}
