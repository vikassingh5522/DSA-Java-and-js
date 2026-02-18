public class NQueenEasy {

    public static void main(String[] args) {

        int n = 4;

        // Create chessboard
        char[][] board = new char[n][n];

        // Initialize board with 'x'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        // Start placing queens from row 0
        nQueen(board, 0);
    }

    // Backtracking function to place queens row by row
    public static void nQueen(char[][] board, int row) {

        int n = board.length;

        // ✅ BASE CASE
        // If all rows are filled, print the solution
        if (row == n) {
            printBoard(board);
            System.out.println();
            return;
        }

        // Try placing queen in each column of current row
        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';      // Place queen
                nQueen(board, row + 1);     // Recursive call for next row
                board[row][col] = 'x';      // BACKTRACK (remove queen)
            }
        }
    }

    // Check whether placing queen is safe
    public static boolean isSafe(char[][] board, int row, int col) {

        int n = board.length;

        // 🔹 1. Check column (only above rows)
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // 🔹 2. Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // 🔹 3. Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true; // Safe position
    }

    // Print the board
    public static void printBoard(char[][] board) {

        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
