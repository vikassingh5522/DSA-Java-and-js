

import java.util.*;

public class distanceandTime {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the distances (in km) :");
        int distnce =sc.nextInt();

        System.out.println("enter the time (in min) : ");
        int time  = sc.nextInt();
      
        if(time < 1 || time> 60){
            System.out.println("error");
        }

        double timeinHours = time / 60.0;
        double speed = distnce / timeinHours ;

        System.out.println((int)speed);


        sc.close();
    }
}