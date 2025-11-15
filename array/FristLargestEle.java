
public class FristLargestEle {

    public static int FindLargeselEment(int numbers[]) { // the numbers is variable

        int firstno = numbers[0]; // first no

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > firstno) {
                firstno = numbers[i];
            }
        }
        return firstno;
    }

    public static void main(String[] args) {

        int arr[] = { 90, 80, 10, 20, 50, 70 };

        int largestvalue = FindLargeselEment(arr);
        System.out.println("largest value is : " + largestvalue);
    }
}

// or

// public class FristLargestEle {

// public static int FindLargestElement(int arr[]) {

// int firstno = arr[0]; // assume first number is largest

// // for-each loop
// for (int num : arr) {
// if (num > firstno) {
// firstno = num;
// }
// }

// return firstno;
// }

// public static void main(String[] args) {

// int arr[] = {90, 80, 10, 20, 50, 70};

// int largestvalue = FindLargestElement(arr);

// System.out.println("largest value is : " + largestvalue);
// }
// }

// or input from user

// import java.util.Scanner;

// public class FristLargestEle {

// public static int FindLargeselEment(int no[]) {

// int firstno = no[0];

// for (int i = 1; i < no.length; i++) {
// if (no[i] > firstno) {
// firstno = no[i];
// }
// }
// return firstno;
// }

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// System.out.print("Enter the size of array : ");
// int size = sc.nextInt();

// int arr[] = new int[size];

// System.out.println("Enter the array values one by one : ");
// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// int largest = FindLargeselEment(arr);
// System.out.println("Largest value is : " + largest);

// sc.close();
// }

// }
