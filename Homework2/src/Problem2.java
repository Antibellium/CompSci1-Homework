import java.util.Scanner;
public class Problem2 {
    public void main() {
        /* Suppose you save $100 each month into a savings account with the annual interest rate 5%.
        Thus, the monthly interest rate is 0.05/12 = 0.00417.
        After the first month, the value in the account becomes 100 * (1 + 0.00417) = 100.417
        After the second month, the value in the account becomes (100 + 100.417) * (1 + 0.00417) = 201.252
        After the third month, the value in the account becomes (100 + 201.252) * (1 + 0.00417) = 302.507
        Write a program that prompts the user to enter a monthly saving amount and displays
        the account value after the sixth month.
        Sample run: Enter the monthly saving amount: 100. After the sixth month, the account value is $608.81.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Input how much money you intend to save each month.");

        double monthlySavings= input.nextDouble();

        double month1 = monthlySavings * (1 + 0.00417);
        double month2 = (monthlySavings + month1) * (1 + 0.00417);
        double month3 = (monthlySavings + month2) * (1 + 0.00417);
        double month4 = (monthlySavings + month3) * (1 + 0.00417);
        double month5 = (monthlySavings + month4) * (1 + 0.00417);
        double month6 = (monthlySavings + month5) * (1 + 0.00417);

        System.out.print("Saving $" + monthlySavings + " monthly in an account with 5% interest will result in an account balance of ");
        System.out.printf ("%.2f", month6);
    }
}
