
// 2 sum leatcode 1

// Brute force approach. O(n2)

import java.util.*;
/* 

public class Tosum {

    public static void main(String[] args) {

        int arr[] = { 5, 2, 11, 7, 15 };
        int tagrat = 9;

        for (int i = 0; i < arr.length; i++) {

            int firstno = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int secound = arr[j];

                int sum = firstno + secound;

                if (sum == tagrat) {
                    System.out.println("total sum :" + sum);
                }

            }
        }

    }
}

*/

// Better approach  using  Sort and two-pointer 

/*  Sorting → O(n log n)
    Two Pointer → O(n)
    Total → O(n log n) 
*/


/* 
public class Tosum {

    public static void main(String[] args){

        int arr[] = { 5,2,11,7,15};
        int tagrat = 9;

        Arrays.sort(arr);

        int start = 0 ;
        int end = arr.length  - 1;

        while (start < end) {

            int sum = arr[start] + arr[end];

            if(sum == tagrat){
                System.out.println( arr[start]+ " " +arr[end]);
                break;
            }
            else if( sum < tagrat){
                start ++; // move forword
            }
            else{
                end --;  // move backword 
            }
            
        }
    }
}

*/

// Optimal Approach 




    public class Tosum {

        public static void main(String[] args) {
            
            int arr[] ={5 ,2,11,7,15};
            int tagrat = 9;

            HashMap <Integer , Integer> map = new HashMap<>();
        

            for( int i = 0 ; i < arr.length ; i++){

                int first = arr[i];
                int secound = tagrat - first;

                if(map.containsKey(secound)){
                    System.out.println(secound +  " " + first );
                    System.out.println(map.get(secound) + " " + i);
                    return; 
                }

            map.put(first, i);
            }

        }
    }