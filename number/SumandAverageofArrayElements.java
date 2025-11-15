

public class SumandAverageofArrayElements {

    public static void main(String[] args) {
       
        int [] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        float average = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            sum += arr[i]; // Calculate the sum of array elements
        }
        average =  sum / length; // Calculate the average
        System.out.println("Sum of array elements is: " + sum);
        System.out.println("Average of array elements is: " + average);



        
    }
}