import java.util.*;

public class HappySad {

    public static void main(String [] args){

       Scanner sc = new Scanner(System.in);

       double h = sc.nextInt();
       double s = 0;

       for(int i = 0 ; i < 4 ; i++){
            double tempH = 0.3 * h + 0.5 * s;
            double tempS = 0.7 * h + 0.5 * s;  // ✅ fixed

            h = tempH;
            s = tempS;
       }

       System.out.println(h + " " + s);

       sc.close();
    }
}