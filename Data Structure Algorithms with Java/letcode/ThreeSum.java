
//  threesum --> lecode 15 ==> a+b+c = 0

// Brute Force Approach  tc-> O(n3)   now O(n2)

import java.util.*;

/* 
public class ThreeSum {
    public static void main(String[] args) {

        int arr[] = { -1, 0, 1, 2, -1, -4 };

        Set<List<Integer>> set = new HashSet<>();  // ✅ FIX

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {

                        // System.out.println(arr[i] + " " + arr[j] + " " + arr[k]); -1 0 1

                        ArrayList<Integer> list = new ArrayList<>();

                        // ✅ store VALUES not indices
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);

                        Collections.sort(list); // normalize
                        set.add(list); // dubliction auto remove 
                    }
                }
            }
        }

        // print unique triplets
        for (List<Integer> triplet : set) {
            System.out.println(triplet);
        }
    }
}

*/

// 2 pointer apporach 
import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int arr[] = { -1, 0, 1, 2, -1, -4 };
        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            // skip duplicate i
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);

                    j++;
                    k--;

                    // skip duplicates for j
                    while (j < k && arr[j] == arr[j - 1]) j++;

                    // skip duplicates for k
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
                else if (sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
    }
}