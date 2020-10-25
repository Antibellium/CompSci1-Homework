import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program will display the hex value of a given number." +
                "\nPlease enter a whole number between 0 and 15.");
        int wholeNumber = input.nextInt();

        if (wholeNumber >= 0 && wholeNumber <= 9)
            System.out.println("The hex value of " + wholeNumber + " is " + wholeNumber + ".");

        else if (wholeNumber >= 10 && wholeNumber <= 15) {
            int hexadecimal = ('A' + wholeNumber - 10);
            System.out.println("The hex value of " + wholeNumber + " is " + (char)hexadecimal + ".");
        }

        else
            System.out.println(wholeNumber + " is an invalid input.");

        input.close();
    }
}
