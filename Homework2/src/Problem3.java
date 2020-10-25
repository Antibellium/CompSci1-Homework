import java.util.Scanner;
public class Problem3 {
    public void main() {
        /* Write a program that reads in investment amount, annual interest rate, and number of years,
        and displays the future investment value using the following formula:
        futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
        For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1,
        the future investment value is 1032.98.
        Here is a sample run:
        Enter investment amount: 1000.56
        Enter annual interest rate in percentage: 4.25
        Enter number of years: 1
        Accumulated value is $1043.92 */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount.");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage.");
        double annualInterest = input.nextDouble();

        System.out.println("Enter number of years.");
        double number0fYears = input.nextDouble();

        double monthlyInterest = annualInterest / 1200;

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterest), number0fYears * 12);

        String formattedFutureInvestment = String.format("%.02f", futureInvestmentValue);

        System.out.print
                ("An investment of $" + investmentAmount + " at " + annualInterest + "% APR for "
                 + number0fYears + " years will result in a future investment value of $" + formattedFutureInvestment);

        input.close();

        /*Previous attempts:
        did not use 'String formattedFutureInvestment'
        1. System.out.printf
                ("An investment of $" + investmentAmount + " at " + annualInterest + "% APR for "
                 + number0fYears + " years will result in a future investment value of $%.2f", futureInvestmentValue);
        2. System.out.printf
                ("An investment of $" + investmentAmount + " at " + annualInterest + "% APR for "
                 + number0fYears + " years will result in a future investment value of $" + "%.2f", futureInvestmentValue);
         */





    }

}