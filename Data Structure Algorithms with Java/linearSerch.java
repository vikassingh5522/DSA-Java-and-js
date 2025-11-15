import java.util.Scanner;

public class linearSerch {
    public static void main(String[] args) {

        // firnding integer

        int arr[] = { 5,3,6,1,4,2};
        int item ;
        boolean found = false;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the search element:");
        item = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
        if(arr[i] == item)
        {
        System.out.println("Element found at index: " + i);
        }
        }
        if (!found) {
            System.out.println("Element not found.");
        }


        // finding the element

        // String [] arr = { "apple", "banana", "cherry", "date", "elderberry", "fig" };
        // String item;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the search element:");
        // item = sc.next();

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i].equals(item)) {
        //         System.out.println("Element found at index: " + i);
        //     }
        // }


        sc.close();
    }

}