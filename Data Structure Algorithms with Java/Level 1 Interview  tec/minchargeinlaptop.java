import java.util.*;

public class minchargeinlaptop {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // System.out.println(" enter the min requrid  charges : ");
        // int no = sc.nextInt();

        System.out.println(" enter the of laptops :");
        int size  = sc.nextInt();

        int arr[] =  new int[size];
        System.out.println("enter  the laptop charges ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0 ; 
         for(int i = 0 ; i <size ; i++){
            if(arr[i]  >= size){
                count++;
            }
         }

         System.out.println("ams :" + count);


    }
}