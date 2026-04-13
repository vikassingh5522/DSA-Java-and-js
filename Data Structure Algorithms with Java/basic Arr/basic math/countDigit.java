

public class countDigit {

    public static int countDigit(int no){
int count = 0 ;
       while ( no !=0) {
         int digit = no % 10;
        //  System.out.println(digit);
         no = no / 10;
         count++;
        
       }
       return count;
    }

    public static void main(String[] args) {
        int no =  123456789;

        System.out.println(countDigit(no));

    }
}