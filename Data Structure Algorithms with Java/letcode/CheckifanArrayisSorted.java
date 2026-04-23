

public class CheckifanArrayisSorted {

    public static boolean issorted(int arr[]){

        //Brute Force
        // for( int i = 0 ; i < arr.length ; i++){
        //     for( int j = i + 1 ; j <arr.length ;j++ ){
        //         if(arr[j] < arr[i]){
        //             return false;
        //         }
        //     }
        // }
        // return true;

        // Optimal 

        for( int i = 1 ; i<arr.length; i++){
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

      System.out.println("sorted arr is "+issorted(arr));



    }
}