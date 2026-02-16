public class factorialofno {
    

     public static int factorial(int no){
        if( no ==0  || no == 1){
            return 1;
        }
        int factnm1  =factorial(no - 1);
        int factn = no * factnm1;
        return factn;
     }

    public static void main(String[] args) {
        
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);

    }
    
}
