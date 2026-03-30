

import java.util.*;

public class parkingFineCal {

    public static void main(String[] args){

        int hours;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many hours you want to park : ");
        hours =sc.nextInt();

        if(hours <= 2){
            System.out.println(200);
        }
        else if(hours <=5){
            System.out.println(500);
        }
        else{
            System.out.println(2010);
        }
        sc.close();
    }

    
}