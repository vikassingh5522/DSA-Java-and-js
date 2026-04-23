import java.util.*;

public class SecSmallandSecondLararray {

    public static void getElement(int arr[], int n) {

        if (n < 2) {
            System.out.println(-1 + " " + -1);
            return;
        }

        Arrays.sort(arr);

        int small = -1, large = -1;

        // second smallest (skip duplicates)
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                small = arr[i];
                break;
            }
        }

        // second largest (skip duplicates)
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                large = arr[i];
                break;
            }
        }

        System.out.println("Second smallest is " + small);
        System.out.println("Second largest is " + large);
    }


    

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 7, 7, 5};

        getElement(arr, arr.length);
    }
}

/* 
//  Optimal solution 

public static void getElement(int arr[], int n) {

    if (n < 2) {
        System.out.println(-1 + " " + -1);
        return;
    }

    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {

        // smallest
        if (num < smallest) {
            secondSmallest = smallest;
            smallest = num;
        } else if (num > smallest && num < secondSmallest) {
            secondSmallest = num;
        }

        // largest
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num < largest && num > secondLargest) {
            secondLargest = num;
        }
    }

    System.out.println("Second smallest: " + secondSmallest);
    System.out.println("Second largest: " + secondLargest);
}

*/