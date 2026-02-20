
// Find the maximum sum of any subarray of size k.

public class SlidingWindowExample {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int maxSum = maxSubarraySum(arr, k);
        System.out.println("Maximum sum: " + maxSum);
    }

    static int maxSubarraySum(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];          // add next element

            if (i >= k - 1) {             // window size reached
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i - (k - 1)]; // remove element leaving window
            }
        }

        return maxSum;
    }
}