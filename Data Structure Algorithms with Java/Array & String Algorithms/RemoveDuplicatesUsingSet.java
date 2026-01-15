import java.util.*;

public class RemoveDuplicatesUsingSet {
    public static void main(String[] args) {

        


        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    

          // using Set 

        Set<Integer> set = new LinkedHashSet<>();

        // Add array elements to set (full for loop)
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Print elements without duplicates (full for loop)
        Object[] result = set.toArray();

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
