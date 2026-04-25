public class FindMissingNumber {


    //Brute forces  
    public static int missnofind(int arr[]) {
        int no = arr.length + 1;

        for (int i = 1; i <= no; i++) { // start from 1
            boolean found = false;

            for (int j = 0; j < arr.length; j++) { // correct range
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }

        return -1;
    }

    // batter 
    public static int missingNum(int[] arr) {
        long n = arr.length + 1;

        // Calculate the sum of array elements
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Use long for expected sum to avoid overflow
        long expSum = n * (n + 1) / 2;

        // Return the missing number
        return (int) (expSum - sum);
    }

     // Optimal 
     public static int missing(int[] arr) {
        int n = arr.length + 1;
        int xor1 = 0, xor2 = 0;

        // XOR all array elements
        for (int i = 0; i < n - 1; i++) {
            xor2 ^= arr[i];
        }

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // Missing number is the XOR of xor1 and xor2
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 2, 4, 5, 3, 7, 1 };

        System.out.println(missnofind(arr)); // print result
    }
}