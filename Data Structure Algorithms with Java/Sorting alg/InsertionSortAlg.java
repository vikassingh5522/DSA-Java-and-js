public class InsertionSortAlg {
    public static void main(String[] args) {
        int arr[] = {36, 19, 29, 12, 5, 8, 10, 30, 40, 50, 60, 70, 58, 885, 999, 455};

        for (int i = 1; i < arr.length; i++) {   
            int temp = arr[i];
            int j = i;

            // shift elements to the right until correct spot is found
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }

            arr[j] = temp;  // place element in correct position
        }

    
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
