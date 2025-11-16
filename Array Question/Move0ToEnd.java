import java.util.Scanner;

public class Move0ToEnd {

    public static void movezerotoend(int arr[]) {

        int index = 0;

        // Step 1: Move all non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter the elements of array : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        movezerotoend(arr);

        System.out.println("Array after moving zeros to the end : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
