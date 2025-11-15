import java.util.*;
import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        int arr[] = { 10, 25, 30, 45, 50, 55, 60, 65, 70 };
        int li = 0;
        int hi = arr.length - 1;
        int mi = (li + hi) / 2;
        int search ;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        search = scanner.nextInt();

        boolean found = false;

        while (li <= hi) {
            if (arr[mi] == search) {
                System.out.println("Element found at index: " + mi);
                found = true;
                break;
            } else if (arr[mi] < search) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if (!found) {
            System.out.println("Element not found.");
        }


        scanner.close();
    }

}
