

public class RecursionDemo {
    
    public static void printNumber(int no){
        
        if (no == 0) {
            return;
        }

        // Print current number
        System.out.println(no);

        // Recursive call
        printNumber(no - 1);
    }
       


    public static void main(String[] args) {
        
        // int no = 5;
        // starting number
        printNumber(5);


    }
}
