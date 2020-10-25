import java.util.Scanner;

public class Main {
    // Let's make a switch that allows us to call any problem class from Main
    public static void main(String[] args) {
        System.out.print("Choose '1' for Problem1, '2' for Problem2, '3' for Problem3.");
        Scanner input = new Scanner(System.in);
        int ch = input.nextInt();

        switch (ch) {

            case 1:
                Problem1 problem1;
                problem1 = new Problem1();
                problem1.main();
                /* 2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value
                from the console, then converts it to Fahrenheit and displays the result.
                */
                break;

            case 2:
                Problem2 problem2;
                problem2 = new Problem2();
                problem2.main();
                /* Write a program that prompts the user to enter a monthly saving amount and displays
                the account value after the sixth month.
                */
                break;


            case 3:
                Problem3 problem3;
                problem3 = new Problem3();
                problem3.main();
                /* Write a program that reads in investment amount, annual interest rate, and number of years,
                and displays the future investment value.*/
                break;


            default:
                System.out.println("Choose '1' for Problem1, '2' for Problem2, '3' for Problem3.");
                break;
        }
    }
}
