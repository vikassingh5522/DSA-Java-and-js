import java.util.Scanner;

public class TwoMatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int R = sc.nextInt();
        int C = sc.nextInt();

        // Max size 1000x1000
        int A[][] = new int[1000][1000];
        int B[][] = new int[1000][1000];
        int Sum[][] = new int[1000][1000];

        // Input first matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Addition
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                Sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Output result
        System.out.println("Sum Matrix:");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// 💡 Example Input
// 2 2
// 1 2
// 3 4
// 5 6
// 7 8
// ✅ Output
// Sum Matrix:
// 6 8
// 10 12