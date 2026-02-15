public class MissingNumberEasy {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5};  // Given array
        int n = 5;                 // Numbers should be from 1 to 5

        // Step 1: Find expected sum of 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Step 2: Find actual sum of array
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        // Step 3: Missing number = expected - actual
        int missing = expectedSum - actualSum;

        System.out.println("Missing number is: " + missing);
    }
}
