// Rotate Array by one time (left rotation)

public class RotateArrayByOne {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        int temp = arr[0]; // store first element

        // shift elements to the left

        for( int i =  0 ; i <arr.length-1; i++){
            arr[i] =arr[i+1];
        }
       
        // put first element at last position
         arr[arr.length - 1] = temp;
    

        // print rotated array
        
         for(int  i = 0 ; i < arr.length; i++){
            System.err.print(arr[i] +" ");
         }
    }
}
