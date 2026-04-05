import java.util.*;

public class maximumsubarrayitself {

    public static void main(String[] args){

        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = arr[0];
        int start = 0;
        int end = 0;

       
        for(int i = 0; i < arr.length; i++){

            int sum = 0;

            for(int j = i; j < arr.length; j++){

                sum = sum + arr[j];

                if(sum > maxSum){
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }

       
        System.out.print("Max Sum: " + maxSum + ", Subarray: [");

        for(int i = start; i <= end; i++){
            System.out.print(arr[i]);
            if(i < end) System.out.print(", ");
        }

        System.out.println("]");
    }
}