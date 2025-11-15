import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class ArrayListToLinkedList {
    public static void main(String[] args) {

        // You can initialize ArrayList in 2 ways:

        // (1) By adding elements one by one
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);

        // (2) OR directly using Arrays.asList()
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3,4,8,9));

        // Convert ArrayList to LinkedList
        LinkedList<Integer> link = new LinkedList<>(arr);

        // Print both
        System.out.println("ArrayList: " + arr);
        System.out.println("LinkedList: " + link);
    }
}
