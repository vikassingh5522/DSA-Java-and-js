import java.util.*;

public class mostFreqProductUseingTopointer {

    public static void mostFreqProdTopointer(int arr[]) {

       

        int N = arr.length;
        int i = 0;

        int maxFreq = 0;
        int result = arr[0];

        while (i < N) {

            int j = i;

            // Count same elements
            while (j < N && arr[j] == arr[i]) {
                j++;
            }

            int freq = j - i;

            // Update result
            if (freq > maxFreq) {
                maxFreq = freq;
                result = arr[i];
            }

            i = j; // Move to next group
        }

        System.out.println(result); // ✅ print result
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // Required for two pointer

        mostFreqProdTopointer(arr); // ✅ fixed

        sc.close();
    }
}