
import java.util.*;

public class maximumsubarrayitselfKadane {

    public static void main(String[]args){

        
         int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

         int maxsum = arr[0];
         int currentsum = arr[0];

         int start = 0 , end = 0  , tempstart = 0;

         for( int i= 0 ; i < arr.length ; i++){
                  // If current sum becomes negative, start new subarray
                  if(currentsum < 0){
                    currentsum = arr[i];
                    tempstart = i;
                  }
                  else{
                    currentsum = currentsum + arr[i];
                  }
                 // Update max sum and indices
                 if(currentsum > maxsum){
                    maxsum  = currentsum;
                    start = tempstart;
                      end  = i ;
                 }
         }
          System.out.print("Maximum Subarray: " +maxsum + ", Subarray: [");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) System.out.print(", ");
        }

        System.out.println("]");
    }
}