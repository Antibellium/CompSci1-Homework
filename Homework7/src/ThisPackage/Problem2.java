package ThisPackage;
import java.util.Scanner;
public class Problem2 {
    /**7.18 (Bubble sort) Write a sort method that uses the bubble-sort algorithm.
     * The bubblesort algorithm makes several passes through the array.
     * On each pass, successive neighboring pairs are compared.
     * If a pair is not in order, its values are swapped; otherwise, the values remain unchanged.
     * The technique is called a bubble sort or sinking sort because the smaller values gradually
     * “bubble” their way to the top and the larger values “sink” to the bottom.
     * Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
     */
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of values you want to sort.");
        int bubbleSortMeLength = input.nextInt();
        double[] bubbleSortMe = new double[bubbleSortMeLength];
        getArray(bubbleSortMe);
        bubbleSort(bubbleSortMe);
        getResults(bubbleSortMe);
        }

    public static void getResults(double[] bubbleSortMe) {
    System.out.print("\nThe sorted values are: ");
    for (double e : bubbleSortMe)
        System.out.print(e + ", ");
    }

    public static void bubbleSort(double[] bubbleSortMe) {
        int keepGoing = 0;
        do {
            for (int i = 0; i < bubbleSortMe.length - 1; i++) {
                if (bubbleSortMe[i + 1] < bubbleSortMe[i]) {
                    double temp = bubbleSortMe[i];
                    bubbleSortMe[i] = bubbleSortMe[i + 1];
                    bubbleSortMe[i + 1] = temp;
                    /*System.out.print("\n");
                    for (double e : bubbleSortMe)
                        System.out.print(e + ", ");*/
                }
            }
            keepGoing++;
        } while (keepGoing < bubbleSortMe.length);
    }

    public static void getArray (double[] bubbleSortMe) {
        int i = 0;
        while (i < bubbleSortMe.length) {
            System.out.print("Enter value " + (i + 1) + ": ");
            bubbleSortMe[i] = input.nextDouble();
            i++;
        }
        System.out.print("The values are: ");
        for (double e : bubbleSortMe)
            System.out.print(e + ", ");
    }
}



