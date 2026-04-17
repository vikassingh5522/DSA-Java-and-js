
public class minmax {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7,8,9};
        int max = arr[0];
        int min = arr[0];
        
        for( int i= 0 ; i < arr.length; i++){
            if(arr[i] > max){
                max =arr[i];
            }
        }

        for( int i= 0 ; i < arr.length; i++){
            if(arr[i] < min){
                min =arr[i];
            }
        }

        System.out.println("max value :->"+max);
        System.out.println(" min value :-> "+min);
    }
}