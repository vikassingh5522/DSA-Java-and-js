import java.util.Scanner;

public class inandout {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("enter the size of arrr:");
       int  n = sc.nextInt();

       int arr[] = new int[n];
       System.out.print("the the no :");
      for(int i = 0 ; i < n ; i++){
        arr[i] = sc.nextInt();
      }

    System.out.println("===============");
      for(int i=0; i <n ; i++){
        System.out.print(arr[i]+ " ");
      }
       sc.close();
    }
}