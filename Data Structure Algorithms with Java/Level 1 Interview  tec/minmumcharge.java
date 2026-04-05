import java.util.*;

public class minmumcharge {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int minchar = sc.nextInt();
        sc.nextLine(); // move to next line

        String line = sc.nextLine(); // read full line
        String[] arr = line.split(" ");

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int value = Integer.parseInt(arr[i]);

            if (value >= minchar) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}