package ThisPackage;
public class Problem1 {
/* 7.16 (Execution time) Write a program that randomly generates an array of 100,000 integers and a key.
Estimate the execution time of invoking the linearSearch method in Listing 7.6.
Sort the array and estimate the execution time of invoking the binarySearch method in Listing 7.7.

You can use the following code template to obtain the execution time:
    long startTime = System.currentTimeMillis();
    perform the task;
    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
     */
static int[] sortMe = new int[100_000];
    public static void main(String[] args) {
        getSortMe();
        int key = getKey();

        long linearTime = runLinearSearch(key);
        long sortTime = getSortTime();
        long binaryTime = getBinaryTime(key);
        printResults(key, sortTime, binaryTime, linearTime);
    }

    private static void printResults(int key, long sortTime, long binaryTime, long linearTime) {
        System.out.println
                ("For an array of 100,000 random integers, let's find out which runs faster: linear search or binary search.");
        System.out.println("The key is " + key + ".");
        System.out.println("The linear search found an index of the key in " +
                linearTime + " nanoseconds, or " + (linearTime / 1_000_000.0) + " milliseconds.");
        System.out.println("The binary search found an index of the key in " +
                binaryTime + " nanoseconds. " +
                "\nHowever, the binary search required a sort. " +
                "\nIf you add the time it took to sort the array to the time the binary search took, " +
                "\nthe whole binary process took " + (binaryTime + sortTime) + " nanoseconds, or " +
                ((binaryTime + sortTime) / 1_000_000.0) + " milliseconds.");
    }

    private static long getBinaryTime(int key) {
        long binaryStart = System.nanoTime();
        binarySearch(sortMe, key);
        long binaryEnd = System.nanoTime();
        long binaryTime = binaryEnd - binaryStart;
        return binaryTime;
    }

    private static long getSortTime() {
        long sortStart = System.nanoTime();
        java.util.Arrays.sort(sortMe);
        long sortEnd = System.nanoTime();
        long sortTime = sortEnd - sortStart;
        return sortTime;
    }

    private static long runLinearSearch(int key) {
        long linearStart = System.nanoTime();
        linearSearch(sortMe, key);
        long linearEnd = System.nanoTime();
        long linearTime = linearEnd - linearStart;
        return linearTime;
    }

    private static int getKey() {
        int key = (int) (Math.random() * sortMe.length);
        return key;
    }


    private static void binarySearch(int[] sortMe, int key) {
        int low = 0;
        int high = sortMe.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < sortMe[mid])
                high = mid - 1;
            else if (key == sortMe[mid]) {
                break;
            }
            else
                low = mid + 1;
        }
    }

    private static void linearSearch(int[] sortMe, int key) {
        for (int i = 0; i < sortMe.length - 1; i++) {
            if (key == sortMe[i]) {
                break;
            }
        }
    }

    private static void getSortMe() {
        for (int i = 0; i < sortMe.length - 1; i++)
            sortMe[i] = (int)(Math.random() * 100_001);
    }
}
