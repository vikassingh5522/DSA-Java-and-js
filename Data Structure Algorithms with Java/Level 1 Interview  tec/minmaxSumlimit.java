import java.util.*;

public class minmaxSumlimit{

    static Map<String, Integer> dp = new HashMap<>();

    static int solve(int[] arr, int idx, int cur, int mx) {

        // If current sum exceeds max → discard
        if (cur > mx) return 0;

        // If all elements processed → valid sum
        if (idx == arr.length) return cur;

        // Create unique key for memoization
        String key = idx + "," + cur;

        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        // Include current element
        int inc = solve(arr, idx + 1, cur + arr[idx], mx);

        // Exclude current element
        int exc = solve(arr, idx + 1, cur, mx);

        // Store and return result
        int res = Math.max(inc, exc);
        dp.put(key, res);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = sc.nextInt();

        System.out.println(solve(arr, 0, 0, maxSum));
    }
}