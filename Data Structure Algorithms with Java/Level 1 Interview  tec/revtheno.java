import java.util.*;

public class revtheno{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of arr :");
        int no = sc.nextInt();

        int arr[] = new int[no];

        // take array input
        System.out.print("enter the elements:");
        for(int i = 0; i < no; i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // ✔ FIX 2: use arr (not no)
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // ✔ ADDED: print reversed array
        System.out.println("Reversed array:");
        for(int i = 0; i < no; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}