import java.util.Scanner;

public class arrMarticesofStudent {

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int internal[][] = new int[100][100];
        int external[][] = new int[100][100];

        for(int i = 0 ; i < R ; i++){
            for( int j = 0 ; j < C ; j++){
                internal[i][j] = sc.nextInt();
            }
        }

        for(int i= 0 ; i < R ; i++){
            for(int j = 0 ; j < C ; j++){
                external[i][j] =sc.nextInt();
            }
        }

        // input index


        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println(internal[i][j] + external[i][j]);
    }
}