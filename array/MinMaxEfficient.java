public class MinMaxEfficient {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0, 70, 80, 90, 5};
        int n = arr.length;
        
        int min, max, i;

        // If n is even
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];
            } else {
                max = arr[1];
                min = arr[0];
            }
            i = 2; // Start from 3rd element
        } else {
            max = arr[0];
            min = arr[0];
            i = 1; // Start from 2nd element
        }

        // Process pairs
        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) max = arr[i];
                if (arr[i + 1] < min) min = arr[i + 1];
            } else {
                if (arr[i + 1] > max) max = arr[i + 1];
                if (arr[i] < min) min = arr[i];
            }
            i += 2;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
