
import java.util.Scanner;

public class sumofallno {

    public static void sumofallno(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // or
            // sum= sum +arr[i];
        }
        System.out.println("The sum of all elements in the array is: " + sum);
        
       
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of element : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        sumofallno(arr);

        scanner.close();

    }
}