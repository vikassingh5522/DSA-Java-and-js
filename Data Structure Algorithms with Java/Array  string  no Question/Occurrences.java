import java.util.Scanner;

public class Occurrences {

    public static void countOccurrences(int no[], int targetelement) {
        int count = 0;
        for (int i = 0; i < no.length; i++) {
            if (no[i] == targetelement) {
                count++;
            }
        }
        System.out.println("The occurrences of the element is: " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to count:");
        int target = sc.nextInt();

        countOccurrences(arr, target);
    
        sc.close();
    }
}
