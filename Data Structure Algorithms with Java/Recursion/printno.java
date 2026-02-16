
// print  no from 5 to 1 using recursion

public class printno {

    public static void printPrme(int no){
        
        if(no == 0){
            return;
        }

        System.out.println(no);
        printPrme(no - 1);
    }

    public static void main(String[] args) {
        int no = 5;


        printPrme(no);

    }
    

}
