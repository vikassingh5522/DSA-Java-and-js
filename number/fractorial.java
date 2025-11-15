import java.util.Scanner;

public class fractorial {

    public static void main(String[] args) {
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial : ");
        no = sc.nextInt();

        int ans = factorial(no);
        System.out.println("factorialof " + no + " is:" + ans);

        sc.close();

    }

    static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);

    }

}