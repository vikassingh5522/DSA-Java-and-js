
import java.util.*;
public class inputbyarrlist {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr");
        int n = sc.nextInt();
      
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter the element");
        for(int i = 0 ; i <n;i++ ){
            list.add(sc.nextInt());
        }
        // printting the ele by loop
        for(int i = 0 ; i < n ; i++){
            System.out.println(list.get(i) + " ");
        }

        // printing the element by using forrach

        for(int ele :  list){
           System.out.println(ele + " ");
        }


    }
    
}
