public class FirstNonRepeating {

    public static char firstNonRepeatingCharacter(String s) {

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
        System.out.println(firstNonRepeatingCharacter("abacabad"));       // c
        System.out.println(firstNonRepeatingCharacter("abacabaabacaba")); // _
    }
}
