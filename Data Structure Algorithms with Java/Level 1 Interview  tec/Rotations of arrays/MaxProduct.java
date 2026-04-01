

import java.util.*;

public class MaxProduct {

    public static int maxPro(int []arr){
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for(int i = 1; i < arr.length ; i++){
            if(arr[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            result  = Math.max(result,max);
        }
        return result;
    }

    public static void main(String[] aegs){


        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of arr: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter  the element :");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("max product : "+maxPro(arr));

        sc.close();

    }
    
}
