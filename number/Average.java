import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int count, no, sum = 0;
        float average = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of number : ");
        count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            no = sc.nextInt();
            sum = sum + no;
        }
        
        average = sum / count;
        System.out.println("sum of all numbers is : " + sum);
        System.out.println("average  of all numbers is : " + average);

        sc.close();

    }
}