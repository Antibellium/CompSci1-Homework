import java.util.Scanner;
public class Problem1 {
    public void main() {
        // Three-Number Addition Game
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        System.out.println("Welcome to the Three-Number Addition Game!" +
                "\nWhat is " + number1 + " + " + number2 + " + " + number3 + "?");
        int answer = input.nextInt();

        System.out.println (number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
                (number1 + number2 + number3 == answer));


    }
}
