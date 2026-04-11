
import java.util.*;

public class maxminoftoDarr {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 21, 10, 9 }
        };

        int ToDmax = arr[0][0];
        int ToDmin = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > ToDmax) {
                    ToDmax = arr[i][j];
                }
            }
        }

        for(int i  = 0 ; i < arr.length ; i++){
            for( int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] < ToDmin){
                    ToDmax = arr[i][j];
                }
            }
        }

        System.out.println("max no :" +ToDmax);
        System.out.println("min no :" +ToDmin);
    }

}
