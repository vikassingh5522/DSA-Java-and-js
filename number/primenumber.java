
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] no = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            no[i] = sc.nextInt();
        }

        System.out.println("all element are  :");
        for (int i = 0; i < 10; i++) {
            System.out.println(no[i] + " ");
        }

        System.out.println("prime list ");
        for (int i = 0; i < 10; i++) {
            if (isPrime(no[i])) {
                System.out.print(no[i] + " ");
            }

        }
        sc.close();

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;

        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }

        }

        return true;

    }

}