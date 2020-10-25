import java.util.Scanner;
public class Problem1 {
    public void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Input temperature in Celsius.");
        double tempCelsius = input.nextDouble();

        double tempFahrenheit = tempCelsius * (9.0 / 5) + 32;

        System.out.println(tempCelsius + " degrees Celsius is equal to " + tempFahrenheit + " degrees Fahrenheit.");








    }
}
