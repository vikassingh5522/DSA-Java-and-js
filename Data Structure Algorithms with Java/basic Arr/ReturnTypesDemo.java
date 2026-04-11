public class ReturnTypesDemo {

    //using void 
     public static void sub(int a, int b){
       int ans = (a-b);
       System.out.println("sub  :"+ans);

    // if there is void we not use return not Necessary ;
       return;
     }


    // 1. int return type
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // 2. float return type
    public static  float divide(float a, float b) {
        float result = a / b;
        return result;
    }

    // 3. boolean return type
    public static  boolean isGreater(int a, int b) {
        return a > b;
    }

    // 4. double return type
    public static  double multiply(double a, double b) {
        return a * b;
    }

    // 5. char return type
    public static   char getGrade() {
        return 'A';
    }

    // 6. String return type
    public static  String getName() {
        return "Java";
    }

    public static void main(String[] args) {

        // When we are creating the object, we do not require the `static` keyword. 
        // ReturnTypesDemo obj = new ReturnTypesDemo();


        sub(10 ,20);


        int sum = add(10, 5);
        System.out.println("Sum: " + sum);

        float div = divide(10.0f, 2.0f);
        System.out.println("Division: " + div);

        boolean check = isGreater(10, 5);
        System.out.println("Is Greater: " + check);

        double mul = multiply(2.5, 4.0);
        System.out.println("Multiply: " + mul);

        char grade = getGrade();
        System.out.println("Grade: " + grade);

        String name = getName();
        System.out.println("Name: " + name);
    }
}