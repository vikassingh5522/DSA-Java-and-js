public class firstnatureno {


    public static void printFirstN(int n , int i , int sum) {
        if(n == 0) {
             sum += i ;
              System.out.println(sum);
            return;
        }
        sum += i ;
        printFirstN(n-1, i+1, sum);
        
    }

    public static void main(String[] args) {
        int n = 5;
        printFirstN(n, 1, 0);   
    }
    
}
