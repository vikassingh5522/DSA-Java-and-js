package string;
public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "  Hello Java World  ";
        String str2 = "hello java world";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 2: " + str.charAt(2));

        // 3. substring()
        System.out.println("Substring (2, 7): " + str.substring(2, 7));

        // 4. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 5. equals()
        System.out.println("Equals: " + str.equals(str2));

        // 6. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        // 7. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 8. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 9. trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 10. split()
        String[] words = str.trim().split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 11. startsWith()
        System.out.println("Starts with 'Hello': " + str.trim().startsWith("Hello"));

        // 12. endsWith()
        System.out.println("Ends with 'World': " + str.trim().endsWith("World"));

        // 13. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf: " + numStr);

        // 14. toCharArray()
        char[] chars = str.trim().toCharArray();
        System.out.print("Char Array: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 15. isEmpty()
        String emptyStr = "";
        System.out.println("Is Empty: " + emptyStr.isEmpty());

        // 16. isBlank()
        String blankStr = "   ";
        System.out.println("Is Blank: " + blankStr.isBlank());

        // 17. replace()
        System.out.println("Replace: " + str.replace('a', 'X'));
    }
}