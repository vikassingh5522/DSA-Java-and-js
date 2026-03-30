public class Arrangements {

    public static int countArrangements(int n, int r, int end) {
        // dp[i][j] = ways to arrange i soldiers with last value = j
        int[][] dp = new int[n + 1][r + 1];

        // Base case
        dp[1][1] = 1; // first soldier must be 1

        for (int i = 2; i <= n; i++) {
            int total = 0;

            // sum of previous row
            for (int j = 1; j <= r; j++) {
                total += dp[i - 1][j];
            }

            for (int j = 1; j <= r; j++) {
                // all ways minus those ending with j
                dp[i][j] = total - dp[i - 1][j];
            }
        }

        return dp[n][end];
    }

    public static void main(String[] args) {
        System.out.println(countArrangements(4, 4, 3)); // Output: 7
    }
}