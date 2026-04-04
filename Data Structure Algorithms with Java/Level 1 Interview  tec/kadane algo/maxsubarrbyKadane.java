
import java.util.*;

public class maxsubarrbyKadane {

    public static void main(String[] args){
       int  arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

       int currentsum = arr[0];
       int maxsumarr = arr[0];

       for(int i = 1; i <arr.length; i ++){

        // if currentSum is negative, start new subarray
          if( currentsum < 0){
            currentsum = arr[i];  // start from inndex 0  stating element
          }
          else{
            currentsum = currentsum + arr[i];
          }

          if(currentsum > maxsumarr){
            maxsumarr = currentsum;
          }
       }
    System.out.println("max sub arr no : "+maxsumarr);

    }
}