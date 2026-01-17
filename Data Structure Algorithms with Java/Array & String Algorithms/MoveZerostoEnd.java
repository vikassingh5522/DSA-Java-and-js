public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int index = 0; // position for next non-zero

        // move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // fill remaining positions with zero
        while (index < arr.length) {
            arr[index++] = 0;
        }

        // print result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
