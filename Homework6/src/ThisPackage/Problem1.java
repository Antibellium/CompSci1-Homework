package ThisPackage;
import java.util.Scanner;
public class Problem1 {
    /* (Sort three numbers) Write a test program that prompts the user to enter three numbers and
    invokes the method to display them in increasing order.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print
                ("This program will display three numbers in increasing order." +
                        "\nPlease enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Please enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Please enter the third number: ");
        double num3 = input.nextDouble();

        System.out.print("In increasing order, the numbers are: ");
        displaySortedNumbers(num1, num2, num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3)
                System.out.println(num3 + ", " + num2 + ", " + num1);
            else
                System.out.println(num2 + ", " + num3 + ", " + num1);
        }
        else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3)
                System.out.println(num3 + ", " + num1 + ", " + num2);
            else
                System.out.println(num1 + ", " + num3 + ", " + num2);
        }
        else {
            if (num1 >= num2)
                System.out.println(num2 + ", " + num1 + ", " + num3);
            else
                System.out.println(num1 + ", " + num2 + ", " + num3);
        }
    }
}
