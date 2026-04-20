import java.util.Scanner;

public class vowelsconsonants {

    public static int maxFreqSum(String s) {

        int arr1[] = new int[26]; // vowels
        int arr2[] = new int[26]; // consonants

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                arr1[ch - 'a']++;
            } else {
                arr2[ch - 'a']++;
            }
        }

        int max1 = 0; // vowel
        int max2 = 0; // consonant

        for (int i = 0; i < 26; i++) {
            max1 = Math.max(max1, arr1[i]);
            max2 = Math.max(max2, arr2[i]);
        }

        return max1 + max2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int result = maxFreqSum(s);

        System.out.println("Output: " + result);

        sc.close();
    }
}