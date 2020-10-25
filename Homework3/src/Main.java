import java.util.Scanner;

public class Main {
    // Let's make a switch that allows us to call any problem class from Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        runMainProgram(input);
    }

    private static void runMainProgram(Scanner input) {
        System.out.println("Choose...\n'1' for Problem 1: Three-Number Addition Game \n" +
                "'2' for Problem 2: Coin Flip Game\n'3' for Problem 3: Rock-Paper-Scissors Game\n'4' to quit program");
        int ch = input.nextInt();


        switch (ch) {

            case 1:
                Problem1 problem1;
                problem1 = new Problem1();
                problem1.main();
                runMainProgram(input);

                break;

            case 2:
                Problem2 problem2;
                problem2 = new Problem2();
                problem2.main();
                runMainProgram(input);

                break;


            case 3:
                Problem3 problem3;
                problem3 = new Problem3();
                problem3.main();
                runMainProgram(input);

                break;

            case 4:
                System.out.println("Thanks and goodbye");

                break;


            default:
                System.out.println("Choose '1' for Problem1, '2' for Problem2, '3' for Problem3.");
                break;
        }
    }
}
