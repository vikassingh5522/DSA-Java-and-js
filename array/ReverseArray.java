
// public class ReverseArray {
//     public static void main(String[] args) {
//         int[] no = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//         System.out.println("Original Array:");
//         for (int i = 0; i < no.length; i++) {
//             System.out.print(no[i] + " ");
//         }

//         System.out.println("\n\nReversed Array:");
//         for(int i =no.length-1; i>=0;i--)
//         {
//             System.out.print(no[i]+" ");
//         }

//     }
// }

import java.util.*;

public class ReverseArray {

    public static void ReverseArrayelement(int no[]) {

        System.out.println("the reves no are : ");
        
        for (int i = no.length - 1; i >= 0; i--) {
            System.out.println(no[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of arr : ");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the ele :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ReverseArrayelement(arr);
        sc.close();

    }
}
