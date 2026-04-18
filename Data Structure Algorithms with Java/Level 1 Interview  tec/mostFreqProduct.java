import java.util.Arrays;
import java.util.Scanner;

public class mostFreqProduct {


    public static void mostFreqcount(int arr[]){
        int currentcount=1;
        int maxCount= 1;
        int result = arr[0];

        for( int i = 1 ; i  < arr.length;i++){
            if(arr[i] == arr[i - 1]){
                currentcount++;
            }
            else{
                currentcount = 1;
            }


            if(currentcount > maxCount){
                maxCount = currentcount;
                result= arr[i];
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0 ; i <N ; i++){
             arr[i] =sc.nextInt();
        }

        Arrays.sort(arr);

        mostFreqcount(arr);

        sc.close();
    }
}