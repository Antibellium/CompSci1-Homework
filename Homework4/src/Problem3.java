import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program takes two strings and checks to see if string 2 is a substring of string 1." +
                "\nNote: This process is case sensitive." +
                "\nEnter string 1:");
        String s1 = input.next();

        System.out.println("Thanks. Now, enter string 2:");
        String s2 = input.next();

        if (s1.contains(s2))
            System.out.println("String 2 is a substring of string 1.");
        else
            System.out.println("String 2 is not a substring of string 1.");

        input.close();
    }
}
