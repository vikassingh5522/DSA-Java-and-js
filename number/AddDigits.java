
import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
     int no , sum = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number to find of digit : ");
     no=sc.nextInt();
        while(no > 0){

            int lastDigit = no % 10; // Get the last digit
            no = no / 10; // Remove the last digit from the number
            sum = sum + lastDigit; // Add it to the sum
        }
        System.out.println("Sum of digits is : " + sum);
        sc.close();

    }
}