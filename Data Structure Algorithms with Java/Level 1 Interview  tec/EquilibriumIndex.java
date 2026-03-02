//  equilibrium index of arraay  

// give aan array an index such sum that sum of elements  on left is equal to sum of elements thaat sum on right return  -1; 
import java.util.Scanner;

public class EquilibriumIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Total sum of array
        int totalSum = 0;
        for (int x : arr) {
            totalSum += x;
        }
        // Left sum
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                sc.close();
                return;
            }
            leftSum += arr[i];
        }
        System.out.println(-1);
        sc.close();
    }
}