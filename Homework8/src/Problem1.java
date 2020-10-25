
public class Problem1 {
    /** 8.3 (Sort students on grades)
     * Rewrite Listing 8.2, GradeExam.java, to display the students in increasing order of the number of correct answers.
     */
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] correctAnswers = new int[answers.length];

        for (int i = 0; i < answers.length; i++) {
            correctAnswers[i] = 0;

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctAnswers[i]++;
            }
        }
        printResults(correctAnswers);
    }


    private static void printResults(int[] correctAnswers) {
        int minimumCorrect = 0;
        do {
            for (int i = 0; i < correctAnswers.length; i++) {
                if (correctAnswers[i] == minimumCorrect)
                    System.out.println("Student " + i + "'s correct count is " + correctAnswers[i]);
            }
            minimumCorrect++;
        } while (minimumCorrect <= correctAnswers.length);
    }
}