
import java.util.*;

public class ReverseString {

     public static void main(String[] args){
 
          Scanner sc = new Scanner(System.in);

          System.out.println("enter the string to rev :");
          String str = sc.nextLine();

          char []arr = str.toCharArray();

          int start = 0;
          int end = arr.length - 1 ;
          char temp;

          while (start < end) {
               temp = arr[start];
              arr[start] = arr[end];
              arr[end] = temp;

              start++;
              end--;
            
          }         
          for(char rev :arr ){
            System.out.print(rev);
          }
          sc.close();
     }
}







