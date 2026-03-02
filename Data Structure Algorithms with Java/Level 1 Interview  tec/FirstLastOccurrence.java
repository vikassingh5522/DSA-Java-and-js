// First and Last Occurrence of an Element
// Using binary search on a sorted array
// If not found → output -1 -1

import java.util.Scanner;

public class FirstLastOccurrence {

    // function to find first occurrence
    static int firstOccurrence(int[] arr, int n, int target) {
        int low = 0, high = n - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1; // search left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // function to find last occurrence
    static int lastOccurrence(int[] arr, int n, int target) {
        int low = 0, high = n - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1; // search right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         System.out.println("Enter the size of array: ");
        // input size
        int n = sc.nextInt();

        // input array (sorted)
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // target value
        int target = sc.nextInt();

        int first = firstOccurrence(arr, n, target);
        int last = lastOccurrence(arr, n, target);

        System.out.println(first + " " + last);

        sc.close();
    }
}