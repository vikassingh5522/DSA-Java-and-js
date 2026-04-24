public class MoveallZerostoend {

    public static void moveZerosEnd(int arr[]) {
        int index = 0;

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: Fill remaining with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};

        moveZerosEnd(arr);

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}