import java.util.*;

public class SingleNoInArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // -------- Method 1 : XOR (Optimal) --------
        int xor = 0;

        for (int num : arr) {
            xor = xor ^  num;
        }

        System.out.println("Single number using XOR: " + xor);


        // -------- Method 2 : HashMap --------
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = 0;

        for (int num : arr) {
            if (map.get(num) == 1) {
                result = num;
                break;
            }
        }

       System.out.println("Single number using HashMap: " + result);

        sc.close();
    }
}