import java.util.*;

class RightRotateD {

    // Reverse function
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

        // Handle d > n
        d = d % n;

        // Step 1: reverse last d elements
        reverse(arr, n - d, n - 1);

        // Step 2: reverse first n-d elements
        reverse(arr, 0, n - d - 1);

        // Step 3: reverse whole array
        reverse(arr, 0, n - 1);

        // Output
        System.out.println("Array after right rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}