import java.util.Scanner;

public class Palindroms {

    
    public static void main(String[] args) {
        int no;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();


        int reverse = 0, temp = no;
        // Logic to check if the number is a palindrome
        while (temp >0) {
            int remainder = temp %10;
            reverse =reverse *10 +remainder;
            temp =temp /10;
        }
        if(no == reverse) {
            System.out.println(no + " is a palindrome.");
        } else {
            System.out.println(no + " is not a palindrome.");
        }
        sc.close();

    }

      
    
}