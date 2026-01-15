import java.util.*;

public class LargestElement {
    public static void main(String[] args) {

        // ---------------- USING ARRAY ----------------
        int[] arr = {3, 2, 1, 5, 2};
        int largestArr = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestArr) {
                largestArr = arr[i];
            }
        }
        System.out.println("Largest element using array: " + largestArr);


        // ---------------- USING ARRAYLIST ----------------
        ArrayList<Integer> arrayList =
                new ArrayList<>(Arrays.asList(3, 2, 1, 5, 2));

        int largestArrayList = Collections.max(arrayList);
        System.out.println("Largest element using ArrayList: " + largestArrayList);


        // ---------------- USING LINKEDLIST ----------------
        LinkedList<Integer> linkedList =
                new LinkedList<>(Arrays.asList(3, 2, 1, 5, 1, 6, 6));

        int largestLinkedList = Collections.max(linkedList);
        System.out.println("Largest element using LinkedList: " + largestLinkedList);


        // ---------------- USING LIST INTERFACE ----------------
        List<Integer> list =
                new ArrayList<>(Arrays.asList(10, 20, 30, 5, 15));

        int largestList = Collections.max(list);
        System.out.println("Largest element using List: " + largestList);
    }
}
