

import java.util.*;

// maximum subarray sum

public class maxsubarray {

    
    public static void main(String[]args){
      
        int arr[] = {3,-4,5,-1,7,-8};
        int maxsubarr = Integer.MIN_VALUE;

        for(int start = 0 ; start <arr.length; start++){
            int currentsum= 0;
            for(int end =start ; end < arr.length ; end++){

                currentsum = currentsum + arr[end];
                if (currentsum > maxsubarr) {
                    maxsubarr = currentsum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxsubarr);

    }
}