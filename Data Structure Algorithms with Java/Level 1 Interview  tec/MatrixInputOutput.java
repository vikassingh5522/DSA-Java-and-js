import java.util.Scanner;

public class MatrixInputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int arr[][] = new int[100][100]; // fixed size

        // Input
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("Matrix is:");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}