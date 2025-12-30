public class palindromsNO {

    public static void main(String[] args) {
          String str = "madam";   // try "madam"
        char[] ch = str.toCharArray();

        int start = 0;
        int end = ch.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (ch[start] != ch[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome string: " + str);
        } else {
            System.out.println("It is NOT a palindrome string: " + str);
        }
    }


   

    }
