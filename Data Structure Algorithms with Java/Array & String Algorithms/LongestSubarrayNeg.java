
// Array with positive + negative numbers

// 👉 Use HashMap (Prefix Sum)

import java.util.HashMap;

public class LongestSubarrayNeg {
    public static void main(String[] args) {

        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // store first occurrence only
            map.putIfAbsent(sum, i);
        }

        System.out.println("Longest subarray length: " + maxLen);
    }
}
