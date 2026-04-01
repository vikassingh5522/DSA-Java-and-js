import java.util.*;

public class MinRotations {

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

        int[] arr1 = {1, 2, 3};
        int[] arr2 = { 2,3,1};

        int n = arr1.length;
        int leftRot = -1;

        // Find rotation index
        for (int i = 0; i < n; i++) {
            if (isMatch(arr1, arr2, i)) {
                leftRot = i;
                break; // stop once found
            }
        }

        if (leftRot == -1) {
            System.out.println("Not a rotation");
            return;
        }

        int rightRot = n - leftRot;

        System.out.println("Left Rotations: " + leftRot);
        System.out.println("Right Rotations: " + rightRot);
        System.out.println("Minimum: " + Math.min(leftRot, rightRot));
    }
}