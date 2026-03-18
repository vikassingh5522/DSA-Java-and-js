import java.util.Scanner;

public class strr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        sc.nextLine(); // clear buffer

        String arr[] = new String[size];

        System.out.println("Enter the strings:");

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextLine();
        }

        System.out.println("Array elements are:");

        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}