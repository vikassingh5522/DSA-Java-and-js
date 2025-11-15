import java.util.Scanner;

public class primeno2 {

  public static void main(String[] args) {
    int no;
    int flag = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number to check if it is prime or not: ");
    no = sc.nextInt();

    if (no == 0 || no == 1) {
      System.out.println(no + " is not a prime number.");
    } else {

      int middleno = no / 2;
      for (int i = 2; i <= middleno; i++) {
        if (no % i == 0) {
          System.out.println(no + " is not a prime number.");
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println(no + " is a prime number.");
      }

    }
    sc.close();

  }
}