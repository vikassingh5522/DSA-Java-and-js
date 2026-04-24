public class MissingNumber {

    // Time: O(n²)
    public static int findMissing(int arr[]) {
        int n = arr.length + 1; // since one number is missing

        for (int i = 1; i <= n; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
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

    public static void main(String[] args) {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};

        System.out.println(findMissing(arr));
    }
}


// Optimal

/* 
public class MissingNumber {

    public static int findMissing(int arr[]) {
        int n = arr.length + 1;

        int xor1 = 0; // 1 to n
        int xor2 = 0; // array elements

        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        for (int num : arr) {
            xor2 ^= num;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};

        System.out.println(findMissing(arr));
    }
}

*/