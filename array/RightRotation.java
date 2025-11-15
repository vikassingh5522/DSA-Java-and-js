public class RightRotation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int last = arr[arr.length - 1]; // store last element
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // shift right
        }
        arr[0] = last; // put last at first

        // print rotated array
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
