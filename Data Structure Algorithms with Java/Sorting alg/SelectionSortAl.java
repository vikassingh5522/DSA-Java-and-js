
public class SelectionSortAl {

    public static void main(String[] args) {

        // for numbers
        // int arr[] = { 36, 19, 29, 12, 5, 8, 10, 30, 40, 50, 60, 70, 58, 885, 999, 455
        // };
        // int min;
        // int temp = 0;

        // for (int i = 0; i < arr.length; i++) {
        // min = i;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] < arr[min]) {
        // min = j;
        // }
        // }

        // temp = arr[i];
        // arr[i] = arr[min];
        // arr[min] = temp;

        // }

        // System.out.println("sorted array :");
        // for (int i : arr) {

        // System.out.print(i + " ");
        // }

        // for strings
        String arr[] = { "deepak", "rahul", "ramesh", "bhuppi", "praveen" };
        String temp;

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i; // assume current index is smallest

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) { 
                    min = j;
                }
            }

            // swap
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("Sorted names: ");
        for (String name : arr) {
            System.out.println(name);
        }

    }

}
