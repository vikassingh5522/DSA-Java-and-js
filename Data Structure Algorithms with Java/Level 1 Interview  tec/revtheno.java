// Reverse the string by using an input output.  
/* 
import java.util.*;

public class revtheno{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of arr :");
        int no = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        // take array input
        System.out.print("enter the elements:");
        for(int i = 0; i < no; i++){
            list.add(sc.nextInt());
        }

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {

            // use arr (not no)
            int temp = list.get(start);
            list.set(start,list.get(end));
        list.set(end ,temp);

            start++;
            end--;
        }

        //  print reversed array
        System.out.println("Reversed array:");
        for(int i = 0; i < no; i++){
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}

*/

// using arr

import java.util.*;
public class revtheno {
    public static void main(String[]args){
      
         Scanner sc = new Scanner(System.in);
 
         System.out.println("enter  the size of arr");
         int no = sc.nextInt();

         int arr[] = new int[no];
         System.out.println("enter  the no :");
         for( int i = 0; i <no; i++ ){
            arr[i] = sc.nextInt();
         }
         revno(arr);
        
        sc.close();
         
    }

    public static void revno(int arr[]){
      
        int start = 0;
        int end = arr.length-1;
        int temp;
 
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("rev no");

       for(int rev : arr){
        System.out.println(rev);
       }

    }
}
