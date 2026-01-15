
import java.util.*;

//  find secound largest emelent in array wahtout shoring ?
public class SecondLargest {
    public static void main(String[] args) {

        // using array

        int arr[] = { 1, 2, 4, 7, 7, 5 };

        int largest = arr[0];
        int second = Integer.MIN_VALUE;

        // Find the largest first
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find the second largest by going backwards
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != largest && arr[i] > second) {
                second = arr[i];
            }
        }

        System.out.println("Second largest element is: " + second);

        // ---------------- USING ARRAYLIST ----------------
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 4, 7, 7, 5));

        // Find largest
        int largestArrayList = Collections.max(arrayList);

        // Remove all occurrences of largest
        arrayList.removeAll(Arrays.asList(largestArrayList));

        // Find second largest
        int secondArrayList = Collections.max(arrayList);

        System.out.println("Second largest element using ArrayList: " + secondArrayList);

        // ---------------- USING LINKEDLIST ----------------
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 4, 7, 7, 5));

        // Find largest
        int largestLinkedList = Collections.max(linkedList);

        // Remove all occurrences of largest
        linkedList.removeAll(Arrays.asList(largestLinkedList));

        // Find second largest
        int secondLinkedList = Collections.max(linkedList);

        System.out.println("Second largest element using LinkedList: " + secondLinkedList);
    }
}
