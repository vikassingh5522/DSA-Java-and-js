
// Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println("Input: " + s);
        System.out.println("Brute Force (O(n^3)): " + bruteForce(s));
        System.out.println("Two Pointers (O(n^2)): " + twoPointers(s));
        System.out.println("Sliding Window (O(n)): " + slidingWindow(s));
    }

    // --------------------------------------------------
    // 1. Brute Force Approach - O(n^3)
    // --------------------------------------------------
    public static int bruteForce(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isUnique(s, i, j)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    private static boolean isUnique(String s, int start, int end) {
        boolean[] seen = new boolean[256];

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if (seen[c]) {
                return false;
            }
            seen[c] = true;
        }
        return true;
    }

    // --------------------------------------------------
    // 2. Two Pointers Approach - O(n^2)
    // --------------------------------------------------
    public static int twoPointers(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int left = 0; left < n; left++) {
            boolean[] seen = new boolean[256];

            for (int right = left; right < n; right++) {
                char c = s.charAt(right);
                if (seen[c]) {
                    break;
                }
                seen[c] = true;
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }

    // --------------------------------------------------
    // 3. Sliding Window (Optimal) - O(n)
    // --------------------------------------------------
    public static int slidingWindow(String s) {
        boolean[] seen = new boolean[256];
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            char c = s.charAt(right);

            // shrink window until duplicate is removed
            while (seen[c]) {
                seen[s.charAt(left)] = false;
                left++;
            }

            seen[c] = true;
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}