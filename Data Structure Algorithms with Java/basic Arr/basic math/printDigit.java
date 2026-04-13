// no = 0 than stop;
// no != 0 run

// % print last digit
// / remove the last digit


public class printDigit {


    public static int printDigit(int no){
        while (no !=0) {
             int digit = no % 10;
             System.out.println(digit);
             no = no /10;
        }

        return no;
    }

    public static void main(String[]arg){
        int no = 12345;

        printDigit(no);

        

    }
}