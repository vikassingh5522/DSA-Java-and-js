import java.util.Scanner;

public class FirstNonRepeating {

    public static char firstNonRepCh(String s) {

        
        int[] freq = new int[26];


        // Step 1: Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        // Step 2: Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        // Step 3: If no such character
        return '_';
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : "); 
        String s = sc.nextLine();

        System.out.println(firstNonRepCh(s));

       sc.close();

        // System.out.println(firstNonRepeatingCharacter("abacabad"));       // c
        // System.out.println(firstNonRepeatingCharacter("abacabaabacaba")); // _
    }
}
