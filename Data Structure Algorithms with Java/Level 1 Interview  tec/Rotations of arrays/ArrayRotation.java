import java.util.*;

public class ArrayRotation {

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

    // Left Rotation
    static void leftRotate(int[] arr, int n, int d) {
        d = d % n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Right Rotation
    static void rightRotate(int[] arr, int n, int d) {
        d = d % n;

        reverse(arr, n - d, n - 1);
        reverse(arr, 0, n - d - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Array is empty");
            return ;
        }

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter D (rotations): ");
        int d = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1. Left Rotation");
        System.out.println("2. Right Rotation");

        int choice = sc.nextInt();

        if (choice == 1) {
            leftRotate(arr, n, d);
            System.out.println("After Left Rotation:");
        } else if (choice == 2) {
            rightRotate(arr, n, d);
            System.out.println("After Right Rotation:");
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}