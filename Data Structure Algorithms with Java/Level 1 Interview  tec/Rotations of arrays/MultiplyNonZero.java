import java.util.*;

public class MultiplyNonZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter comma-separated integers: ");
        String input = sc.nextLine();

        String[] tokens = input.split(",");

        int product = 1;
        boolean foundNonZero = false;

        for (String token : tokens) {
            int num = Integer.parseInt(token.trim());

            if (num != 0) {   // Ignore zeros
                product *= num;
                foundNonZero = true;
            }
        }

        // If all were zero
        if (!foundNonZero) {
            product = 0;
        }

        System.out.println("Output: " + product);

        sc.close();
    }
}