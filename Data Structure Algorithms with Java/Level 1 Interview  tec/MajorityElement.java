import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");

        // Read size of array
        int n = sc.nextInt();

        // Declare array
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Loop through each element
        for (int i = 0; i < n; i++) {

            int count = 0; // count occurrences of arr[i]

            // Count how many times arr[i] appears
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if it is majority element
            if (count > n / 2) {
                System.out.println(arr[i]); // print majority element
                sc.close();
                return;
            }
        }

        // If no majority element found
        System.out.println(-1);
        sc.close();
    }
}