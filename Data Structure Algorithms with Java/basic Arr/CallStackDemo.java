public class CallStackDemo {

    public static void main(String[] args) {
        System.out.println("Main starts");
        int result = methodA(5);
        System.out.println("Final Result: " + result);
        System.out.println("Main ends");
    }

    public static int methodA(int x) {
        System.out.println("Enter methodA with x = " + x);
        int y = methodB(x + 2);
        System.out.println("Exit methodA with y = " + y);
        return y * 2;
    }  //14

    public static int methodB(int x) {
        System.out.println("Enter methodB with x = " + x);
        int y = methodC(x * 2);
        System.out.println("Exit methodB with y = " + y);
        return y - 3;
    }

    public static int methodC(int x) {
        System.out.println("Enter methodC with x = " + x);
        
        if (x <= 10) {
            System.out.println("Base condition reached in methodC");
            return x;
        }

        int result = methodC(x - 4); // recursive call
        System.out.println("Returning from methodC with x = " + x);
        return result + 1;
    }
}


/*
📌 Flow of Calls
main()
  ↓
methodA(5)
  ↓
methodB(7)
  ↓
methodC(14)
  ↓
methodC(10)   ← base condition

📦 Stack Visualization (Very Important)
When deepest call happens:
| methodC(10) |  ← top (executing)
| methodC(14) |
| methodB(7)  |
| methodA(5)  |
| main()      |


🔄 Returning Phase (Stack Pops)
methodC(10) returns → removed
methodC(14) resumes → returns
methodB(7) resumes → returns
methodA(5) resumes → returns
main() resumes */