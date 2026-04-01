import java.util.*;

public class MinRotationsuserinput {

    // Check if rotation works
    static boolean isMatch(int[] arr1, int[] arr2, int start) {
        int n = arr1.length;

        for (int j = 0; j < n; j++) {
            if (arr1[(start + j) % n] != arr2[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // Input arr1
        System.out.println("Enter elements of arr1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input arr2
        System.out.println("Enter elements of arr2:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int leftRot = -1;

        // Find rotation index
        for (int i = 0; i < n; i++) {
            if (isMatch(arr1, arr2, i)) {
                leftRot = i;
                break;
            }
        }

        if (leftRot == -1) {
            System.out.println("Not a rotation");
        } else {
            int rightRot = n - leftRot;

            System.out.println("Left Rotations: " + leftRot);
            System.out.println("Right Rotations: " + rightRot);
            System.out.println("Minimum Rotations: " + Math.min(leftRot, rightRot));
        }

        sc.close();
    }
}