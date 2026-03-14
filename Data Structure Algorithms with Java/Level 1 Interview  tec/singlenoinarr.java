
import java.util.*;

public class singlenoinarr {
    public static void main(String[] args) {

        // using arr
        // int arr[] = {4,1,2,1,2} ;
        // int no = arr.length;

        int result = 0;

        // ussing input 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr:");
        int no = sc.nextInt();

        int arr[] = new int[no];

        System.out.println("enter the the no :");
        for (int i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < no; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < no; i++) {
            if (map.get(arr[i]) == 1) {
                result = arr[i];
                break;
            }
        }

        System.out.println(result);

    }

}
