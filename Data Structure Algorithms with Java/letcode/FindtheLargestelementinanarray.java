

import java.util.*;

public class FindtheLargestelementinanarray {



    // Brute Force
    /* 
    public static int issort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }*/

        public static int issort(int arr[]){
            int max = arr[0];
            for(int i = 0 ; i <arr.length ; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }
    
    public static void main(String[] args) {

        int arr[] = {2, 5, 1, 3, 0};  

        System.out.println("larges element : " + issort(arr));
        
    }
}
