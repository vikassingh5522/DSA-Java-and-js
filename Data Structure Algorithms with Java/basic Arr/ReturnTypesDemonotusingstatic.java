public class ReturnTypesDemonotusingstatic {

    // 1. int return type
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // 2. float return type
    public float divide(float a, float b) {
        float result = a / b;
        return result;
    }

    // 3. boolean return type
    public boolean isGreater(int a, int b) {
        return a > b;
    }

    // 4. double return type
    public double multiply(double a, double b) {
        return a * b;
    }

    // 5. char return type
    public char getGrade() {
        return 'A';
    }

    // 6. String return type
    public String getName() {
        return "Java";
    }

    public static void main(String[] args) {


        // When we are creating the object, we do not require the `static` keyword. 
        ReturnTypesDemonotusingstatic obj = new ReturnTypesDemonotusingstatic();
       

        int sum = obj.add(10, 5);
        System.out.println("Sum: " + sum);

        float div = obj.divide(10.0f, 2.0f);
        System.out.println("Division: " + div);

        boolean check = obj.isGreater(10, 5);
        System.out.println("Is Greater: " + check);

        double mul = obj.multiply(2.5, 4.0);
        System.out.println("Multiply: " + mul);

        char grade = obj.getGrade();
        System.out.println("Grade: " + grade);

        String name = obj.getName();
        System.out.println("Name: " + name);
    }
}