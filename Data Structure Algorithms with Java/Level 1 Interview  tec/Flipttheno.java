
import java.util.*;

public class Flipttheno {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int start  = sc.nextInt();
        int goal = sc.nextInt();

        int no = start ^ goal;
        System.out.println(Integer.bitCount(no));

    }
}
