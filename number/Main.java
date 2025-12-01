import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principle: ");
        double p = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double amount = p * java.lang.Math.pow(1 + (r / 100), t);
        double interest = amount - p;

        System.out.printf("%.2f\n", interest);
    }
}
