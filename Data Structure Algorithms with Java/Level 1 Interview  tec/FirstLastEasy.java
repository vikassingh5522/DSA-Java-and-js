// First and Last Occurrence of an Element
// Using binary search on a sorted array
// If not found → output -1 -1
import java.util.Scanner;

public class FirstLastEasy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {  // array input
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();     // target element

        int first = -1, last = -1;

        // Binary search for first occurrence
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;   // move left
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Binary search for last occurrence
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;    // move right
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(first + " " + last);
        sc.close();
    }
}