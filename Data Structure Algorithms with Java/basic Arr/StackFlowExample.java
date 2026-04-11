public class StackFlowExample {

    public static void main(String[] args) {
        System.out.println("Start main");
        int result = startProcess(3);
        System.out.println("Final result: " + result);
        System.out.println("End main");
    }

    public static int startProcess(int n) {
        System.out.println("Enter startProcess: " + n);
        int value = square(n) + cube(n - 1);
        System.out.println("Exit startProcess");
        return value;
    }

    public static int square(int x) {
        System.out.println("Enter square: " + x);
        int result = multiply(x, x);
        System.out.println("Exit square");
        return result;
    }

    public static int cube(int x) {
        System.out.println("Enter cube: " + x);
        
        if (x == 0) {
            System.out.println("Base case cube");
            return 0;
        }

        int result = multiply(x, x) * x + cube(x - 1); // recursion
        System.out.println("Exit cube: " + x);
        return result;
    }

    public static int multiply(int a, int b) {
        System.out.println("Enter multiply: " + a + ", " + b);
        int res = a * b;
        System.out.println("Exit multiply");
        return res;
    }
}