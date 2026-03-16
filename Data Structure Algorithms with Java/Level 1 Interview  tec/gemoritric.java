
import java.util.*;

public class gemoritric {
     public static void main(String[] args){
    
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter the no : ");
         
        int n = sc.nextInt();
        int result ;
        int power ;

        // check the n is even or odd
        if(n % 2 !=0  ){
            //formula
             power = (n-1)/2;

            //  use type casng
             result = (int)Math.pow(2, power);
        }
        else{
            //formula
             power = (n / 2) - 1 ;
             result = (int)Math.pow(3,power);

        }
        System.out.print("ans  : " +result);

     }
}
