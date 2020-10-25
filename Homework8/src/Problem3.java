
public class Problem3 {
    /** 8.18 (Shuffle rows)
     * Write a method that shuffles the rows in a two-dimensional
     * int array using the following header:
     * public static void shuffle(int[][] m)
     * Write a test program that shuffles the following matrix:
     * int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
     * keep the pairs together!!
     *
     *
     */
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Before the sort: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
        shuffle(m);
        System.out.println("After the sort: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    private static void shuffle(int[][] m) {
        for (int i = 0; i < 5; i++){
            int[] temp = {0, 0};
            int randomIndex = (int)(Math.random()*5);
            temp[0] = m[randomIndex][0]; temp[1] = m[randomIndex][1];
            m[randomIndex][0] = m[i][0]; m[randomIndex][1] = m[i][1];
            m[i][0] = temp[0]; m[i][1] = temp[1];
            System.out.println("After sort " + (i + 1) + ": ");
            for (int a = 0; a < 5; a++){
                for (int j = 0; j < 2; j++)
                    System.out.print(m[a][j] + " ");
                System.out.println();
            }
        }
    }
}
