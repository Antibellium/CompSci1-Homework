import java.util.Scanner;
public class Problem2 {
    /**
     * 8.9 (Game: play a tic-tac-toe game)
     * In a game of tic-tac-toe, two players take turns marking an available cell
     * in a 3 * 3 grid with their respective tokens (either X or O).
     * When one player has placed three tokens in a horizontal, vertical, or
     * diagonal row on the grid, the game is over and that player has won.
     * A draw (no winner) occurs when all the cells on the grid have
     * been filled with tokens and neither player has achieved a win.
     * <p>
     * Create a program for playing tic-tac-toe.
     * <p>
     * The program prompts two players to enter an X token and O token alternately.
     * Whenever a token is entered, the program redisplays the board on the console
     * and determines the status of the game (win, draw, or continue).
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},};
        System.out.println("Let's play Tic Tac Toe! There are two players; one is X, one is O.");
        printBoard(board);
        boolean win = false;
        do {
            playerX(board);
            printBoard(board);
            win = checkForWin(board);
            if (win) {
                System.out.print("\nThree in a row! Player X wins!");
                break;
            }
            playerO(board);
            printBoard(board);
            win = checkForWin(board);
            if (win) {
                System.out.print("\nThree in a row! Player O wins!");
                break;
            }
        } while (!win);
    }

    private static boolean checkForWin(char[][] board) {
        boolean win = false;
        // horizontal?
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                win = true; break;
            }
        }
        // vertical?
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                win = true; break;
            }
        }
        // diagonal?
        if (board[1][1] != ' ') {
            if (board[1][1] == board[0][0] && board[1][1] == board[2][2])
                win = true;
            else if (board[1][1] == board[2][0] && board[1][1] == board[0][2])
                win = true;
        } return win;
    }

    private static void playerO ( char[][] board){
            boolean rowDone = false;
            boolean columnDone = false;
            int row = 0;
            char column;
            int columnIndex = 0;

            System.out.println("\nPlayer O, pick a space.");
            while (!rowDone) {
                System.out.print("Enter a row number: ");
                row = input.nextInt();
                if (0 < row && row < 4)
                    rowDone = true;
                else
                    System.out.println("\nInvalid row.");
            }
            while (!columnDone) {
                System.out.print("Enter a column letter 'a', 'b', or 'c': ");
                column = input.next().charAt(0);
                switch (column) {
                    case 'a':
                        columnIndex = 0;
                        columnDone = true;
                        break;
                    case 'b':
                        columnIndex = 1;
                        columnDone = true;
                        break;
                    case 'c':
                        columnIndex = 2;
                        columnDone = true;
                        break;
                    default:
                        System.out.print("\nInvalid format.");
                        columnDone = false;
                        break;
                }
            }
            board[row - 1][columnIndex] = 'O';
        }

    private static void playerX ( char[][] board){
            boolean rowDone = false;
            boolean columnDone = false;
            int row = 0;
            char column;
            int columnIndex = 0;
            System.out.println("\nPlayer X, pick a space.");

            while (!rowDone) {
                System.out.print("Enter a row number: ");
                row = input.nextInt();
                if (0 < row && row < 4)
                    rowDone = true;
                else
                    System.out.println("\nInvalid row.");
            }
            while (!columnDone) {
                System.out.print("Enter a column letter 'a', 'b', or 'c': ");
                column = input.next().charAt(0);
                switch (column) {
                    case 'a':
                        columnIndex = 0;
                        columnDone = true;
                        break;
                    case 'b':
                        columnIndex = 1;
                        columnDone = true;
                        break;
                    case 'c':
                        columnIndex = 2;
                        columnDone = true;
                        break;
                    default:
                        System.out.print("\nInvalid format.");
                        columnDone = false;
                        break;
                }
            }
            board[row - 1][columnIndex] = 'X';
        }

    private static void printBoard ( char[][] board){
            String top = "  ___________ ";
            String midToBottom = " |___|___|___|";

            System.out.print("\n   a   b   c\n" + top);
            for (int i = 0; i < board.length; i++) {
                System.out.print("\n" + (i + 1) + "| ");
                for (int j = 0; j < board[i].length; j++)
                    System.out.print(board[i][j] + " | ");
                System.out.print("\n" + midToBottom);
            }
        }
}