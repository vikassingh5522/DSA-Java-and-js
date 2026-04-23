import java.util.ArrayList;
import java.util.Collections; // important
import java.util.Iterator;
import java.util.List;

// collections 

public class collection {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // sort

        System.out.println("before sort");

        System.out.println("====================");

        list.add(1);
        list.add(2);

        Collections.sort(list); // asc

        System.out.println(list);


        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list); // dec


        System.out.println("=========================");
        // Iterator: step-by-step traversal
        // Iterator<Integer> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }


        
        // Iterable: used in for-each loop
        // Iterable<Integer> iterable = list;
        // for (Integer i : iterable) {
        //     System.out.println(i);
        // }
    }
}