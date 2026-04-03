import java.util.Scanner;

public class haappysad {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial happy value
        double happy = sc.nextDouble();
        double sad = 0;

        // Run loop 4 times
        for (int i = 0; i < 4; i++) {

            double newHappy = 0.3 * happy + 0.5 * sad;
            double newSad   = 0.7 * happy + 0.5 * sad;

            // Update values
            happy = newHappy;
            sad = newSad;
        }

        // Output result
        System.out.println(happy + " " + sad);

        sc.close();
    }
    
}
