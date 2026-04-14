

import java.util.*;
public class arrMarticesofStudent {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int internal[][] = new int[100][100];
        int external[][] = new int[100][100];

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ;  j< c ; j++){
                internal[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i<r ; i++){
            for( int j = 0 ; j < c ; j++){
                external[i][j] = sc.nextInt();
            }
        }
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println(internal[i][j] + external[i][j]);


        sc.close();

    }
}