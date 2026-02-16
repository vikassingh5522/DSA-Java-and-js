public class primenoByrec {

  static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }   


    public static void printPrime(int no){

        if (no ==0) {
            return;
        }
        if (isPrime(no)) {
            System.out.println(no);
        }
        printPrime(no - 1);
    }


    public static void main(String[] args) {
          int no = 5;
          printPrime(no);
    }
    
}

// Time: O(n √n)
// Space: O(n) (recursion stack)