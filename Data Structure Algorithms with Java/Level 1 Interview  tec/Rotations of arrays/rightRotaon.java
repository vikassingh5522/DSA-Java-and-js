
import java.util.*;

public class rightRotaon {

    static void rev(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter  the sze of a arr: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("enter the element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("enter the D no ratiion :");
        int d = sc.nextInt();

        d = d % size;

        // rev last element
        rev(arr, size - d, size - 1);

        // rev the first element

        rev(arr, 0, size - d - 1);

        // rev whole arr
        rev(arr, 0, size - 1);

        System.out.print(" all reve rotaion element :");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();

    }

}
