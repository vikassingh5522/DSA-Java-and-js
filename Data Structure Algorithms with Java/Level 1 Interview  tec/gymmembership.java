

import java.util.*;

public class gymmembership {

    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        int month;
        System.out.println("Enter the month :");
        month = sc.nextInt();

        if(month <= 0){
            System.out.println("Invalid input");
        }
        else if(month <= 1){
            System.out.println("cost price : 2000");
        }
        else if(month <= 3){
            System.out.println("cost price : 5000");
        }
        else if(month <= 6){
            System.out.println("cost price : 4000");
        }
        else{
            System.out.println("cost price : 15000");
        }

        sc.close();
    }
    
}