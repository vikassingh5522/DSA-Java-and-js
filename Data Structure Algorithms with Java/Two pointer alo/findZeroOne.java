
// Use two pointers:
// i → from the left
// j → from the right
// Move i until it finds 1
// Move j until it finds 0
// Swap them
// arr = [1,0,0,1,0,1,1,0,0]
//  o/p  -> [0,0,0,0,0,1,1,1,1]

class findZeroOne {

    // Method to sort 0s and 1s
    public static void sortZeroOne(int[] arr) {
        int i = 0;
        int j = arr.length - 1;   // ❗ j was missing

        while (i < j) {

            // Move i forward if element is 0
            while (i < j && arr[i] == 0) {
                i++;
            }

            // Move j backward if element is 1
            while (i < j && arr[j] == 1) {
                j--;
            }

            // Swap arr[i] and arr[j]
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

 
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0};

        sortZeroOne(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}