import java.util.*;

class Rotionleft {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store first element
        int first = arr[0];

        // Shift elements left
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        // Put first element at end
        arr[n - 1] = first;

        // Print result
        // System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}