
import java.util.*;

public class Flipttheno {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int start  = sc.nextInt();
        int goal = sc.nextInt();

        int no = start ^ goal;
        // not usng ths meth
        // System.out.println(Integer.bitCount(no));
        int count = 0;
        while (no !=0) {
            no = no & (no-1);
            count++;
        }
        
        System.out.println(count);
        sc.close();
    }
}
