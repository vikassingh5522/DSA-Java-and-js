
import java.util.*;


//to check the number 

public class plindrome {
 
     public static void main(String[] args){

        /* 

        // using array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the siize of array: ");
        int no = sc.nextInt();
    
        int arr[] = new int[no];
        System.out.println("Enter the number : ");
        for(int i = 0 ; i < no ; i++){
            arr[i] =sc.nextInt();
        }

        for( int i = 0 ; i < no ; i++){
            isPlin(arr[i]);
        }
       */


        Scanner sc = new Scanner(System.in);

        System.out.println(" enter  the  no:");
        int no = sc.nextInt();
        
        isPlin(no);
        sc.close();
     }

     public  static  void isPlin(int no){

    
        int original = no;
        int rev = 0 ;
        while (no >0) {
            rev = rev * 10 + no % 10;
            no = no /10;
        }

        if(original == rev){
            System.out.println("it is palindrome no : "+rev);
        }
        else{
            System.out.println("it not palindrome : "+rev);
        }

     }
    
}





// to check  the string 
/* 
class plindrome {

    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = sc.nextLine();

        if(isPlindrome(str)){
          System.out.print("it is plindrome : "+str);
        }else{
            System.out.print("is not plindrome :" +str);
        }

        sc.close();
        }


    public static boolean isPlindrome(String str) {

        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;  // chek  not pl
            }

            start++;
            end--;
        }

        return true; // it is pl
    }

}

 */