import java.util.Arrays;
import java.util.Collections;

public class AscDes {
    public static void main(String[] args) {
        
        // Ascending order
        int arr1[] = {10, 40, 10, 20, 30};
        Arrays.sort(arr1); // sort ascending
        System.out.println("Ascending: " + Arrays.toString(arr1));

        // Descending order → use Integer[] instead of int[]
        Integer arr2[] = {10, 20, 30, 40, 50, 60, 70};
        Arrays.sort(arr2, Collections.reverseOrder()); // sort descending
        System.out.println("Descending: " + Arrays.toString(arr2));
    }
}
