import java.util.*;


//Print all the sub-arrays. 
public class printsubarray {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }

        // by using -> i j k
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {
        //         for (int k = i; k <= j; k++) {
        //             System.out.print(arr[k]);
        //         }
        //         System.out.println();
        //     }
        // }

    }

}