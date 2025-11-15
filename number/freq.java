public class freq {

    public static void main(String[] args) {
        
        String str = "iii amm vikas ";

        // Array to store frequency counts. We assume extended ASCII (256 chars).
        int[] freq = new int[256];  

        // Count frequencies
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;   // increment count for that character
        }

        // Display frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}