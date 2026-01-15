import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CheckIsSorted {
    public static void main(String[] args) {


        // using Array
        int arr[] = {1, 2, 1, 3, 4, 8, 3};
        boolean sorted = true; // assume sorted initially

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) { // if current < previous, not sorted
                sorted = false;
                break; // no need to check further
            }
        }

        if (sorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is NOT sorted.");
        }


       // ---------------- USING ARRAYLIST ----------------
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("ArrayList: " + arrayList);

        if (isSorted(arrayList)) {
            System.out.println("ArrayList is sorted.");
        } else {
            System.out.println("ArrayList is NOT sorted.");
        }

        // ---------------- USING LINKEDLIST ----------------
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 3, 2, 4, 5));
        System.out.println("LinkedList: " + linkedList);

        if (isSorted(linkedList)) {
            System.out.println("LinkedList is sorted.");
        } else {
            System.out.println("LinkedList is NOT sorted.");
        }
    }

    // ---------------- HELPER METHOD ----------------
    public static boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false; // found an unsorted pair
            }
        }
        return true; // all elements are in ascending order
    }
}
