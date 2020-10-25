import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        /*  5.2 (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions.
        Revise the program to generate ten random addition questions for two integers between 1 and 15.
        Display the correct count and test time.
         */
        final int NUMBER_OF_QUESTIONS = 10; // change 5 to 10
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 16); // change 10 to 15
            int number2 = (int) (Math.random() * 16); // change 10 to 15

            System.out.print("What is " + number1 + " + " + number2 + "? "); // - to +
            int answer = input.nextInt();

            if (number1 + number2 == answer) { // - to +
                System.out.println("You are correct!");
                correctCount++;
            }
            else
                System.out.println
                        ("Your answer is wrong. \n" + number1 + " + " + number2 + " should be " + (number1 + number2));// - to +

            count++;
            output += "\n" + number1 + " + " + number2 + " = " + answer +
                    ((number1 + number2 == answer) ? " correct": " wrong"); // - to + ; changed spacing
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
