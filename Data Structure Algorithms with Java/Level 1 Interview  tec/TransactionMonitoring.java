
import java.util.*;

public class TransactionMonitoring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // no of number of transactions
        int no = sc.nextInt();

        Set<String> set = new HashSet<>(); // to check the dubliction
        int prevTime = -1; // store last timestamp

        for (int i = 0; i < no; i++) {

            String send = sc.next();
            String receiver = sc.next();

            int time = sc.nextInt();
            // int amount = sc.nextInt(); // not used

            String pair = send + "-" + receiver;
            // checking dublictions
            if (set.contains(pair)) {
                System.out.println("Duplicate Transaction");
                return;
            }
            set.add(pair);

            if (prevTime != 1 && time - prevTime > 60) {
                System.out.println("Fraud Detected");
            }

            prevTime = time;

            sc.close();
        }
        // If all checks passed
        System.out.println("All Transactions Valid");
    }
}
