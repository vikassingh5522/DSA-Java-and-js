public class LeftRotateByD {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 3;                  // rotate by 2 places
        int n = arr.length;
        d = d % n;                  // handle d > n

        // temp array
        int[] temp = new int[d];

        // store first d elements
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // shift remaining elements
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // copy temp elements at end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }

        // print result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
