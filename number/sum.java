

// 3
import java.util.Scanner;

// public class sum{
//     public static void main(String[] args){

           
//         int no1,no2,sum;
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter first number:");
//         no1 =sc.nextInt();
//         System.out.println("Enter second number:");
//         no2 =sc.nextInt();
//         sum=no1+no2;
//         System.out.println("Sum of two numbers is: " + sum);
//         sc.close();
//     }
// }



// 4


public class sum {

    public static void main(String[] args)
    {
        int count ,no,sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of number : ");
        count = sc.nextInt();

        for(int i=0; i<count;i++)
        {
            no = sc.nextInt();
            sum = sum + no;
        }

    System.out.println("sum od all numbers is : " + sum);
        sc.close();

    }
}
