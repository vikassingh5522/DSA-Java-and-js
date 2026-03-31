import java.util.*;

class LeftRotateD {

    // Function to reverse part of array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter D (number of rotations): ");
        int d = sc.nextInt();

        // Handle cases where d > n
        d = d % n;

        // Step 1: reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 2: reverse remaining elements
        reverse(arr, d, n - 1);

        // Step 3: reverse whole array
        reverse(arr, 0, n - 1);

        // Output
        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}