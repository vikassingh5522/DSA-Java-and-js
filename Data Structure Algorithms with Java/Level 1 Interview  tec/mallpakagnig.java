



import java.util.*;


public class mallpakagnig{

    public static void main(String[]args){

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int C =sc.nextInt();
        
        int matrix [][] = new int[R][C];

        for(int i = 0 ; i < R ; i++){
            for(int j = 0 ; j < C; j++){
                 matrix[i][j]  = sc.nextInt();
            }
        }
        int result = rowwithmaxocc(matrix,R,C);
        System.out.print(result+1);
    }

    public static int rowwithmaxocc(int matrix[][] ,int  R,int C){
        int maxCount = 0;
        int rowIndex = -1;

        for(int  i= 0 ; i < R; i++){
            int count = 0 ;
            for(int j = 0 ; j < C ; j++){
                if(matrix[i][j] == 1){
                    count++;
                }
                if(count > maxCount){
                   maxCount  =count;
                   rowIndex = i;
                }
               
            }
        }
        return rowIndex;
    }
}
