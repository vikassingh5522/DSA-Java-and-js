public class NQueenEasy {

    // Size of chessboard (N x N)
    static int N = 4;

    // Backtracking function to place queens row by row
    public static void solve(int board[][], int row) {

        // ✅ BASE CASE
        // If we have placed queens in all rows,
        // it means we found one valid solution
        if (row == N) {
            printBoard(board);   // print the solution
            System.out.println();
            return;              // return to try another solution
        }

        // Try placing queen in every column of current row
        for (int col = 0; col < N; col++) {

            // Check if queen can be placed safely
            if (isSafe(board, row, col)) {

                board[row][col] = 1;   // 👉 Place queen (choice)

                solve(board, row + 1); // 👉 Recurse for next row

                board[row][col] = 0;   // 👉 Remove queen (BACKTRACK)
            }
        }
    }

    // Function to check whether placing a queen is safe
    public static boolean isSafe(int board[][], int row, int col) {

        // 🔹 1. Check same column above
        // (No need to check below because we place row by row)
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // 🔹 2. Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 1)
                return false;
        }

        // 🔹 3. Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < N;
             i--, j++) {

            if (board[i][j] == 1)
                return false;
        }

        // If no attack possible, position is safe
        return true;
    }

    // Function to print the chessboard
    public static void printBoard(int board[][]) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                // Print Q for queen, . for empty cell
                System.out.print(board[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create empty chessboard (all values 0)
        int board[][] = new int[N][N];

        // Start solving from row 0
        solve(board, 0);
    }
}
