

// tcs
import java.util.*;
public class minimumEfficien {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T =sc.nextInt();

        int arr[] = new int[1000];

        for(int i = 0 ; i <N ; i++){
                arr[i] =sc.nextInt();
        }
        
        Arrays.sort(arr, 0 , N);

        int maxDiff = 0;
         for (int i = 0; i + T - 1 < N; i += T) {
            int diff = arr[i + T - 1] - arr[i];
            maxDiff = Math.max(maxDiff, diff);
        }

      
        System.out.println(maxDiff);

        sc.close();

    }
    
}
