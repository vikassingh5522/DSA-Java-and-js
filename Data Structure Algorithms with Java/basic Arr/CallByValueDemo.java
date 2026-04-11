
//Pass-by-Value
public class CallByValueDemo {

    
    public static void changeValue(int x) {
        System.out.println("Inside method (before change): " + x); //10
        x = 50;  // changing local copy
        System.out.println("Inside method (after change): " + x); //50
    }

    public static void main(String[] args) {
        int num = 10;

        System.out.println("Before method call: " + num);  //10
        changeValue(num);
        System.out.println("After method call: " + num);// 10 
    }

}


/*

Before method call: 10
Inside method (before change): 10
Inside method (after change): 50
After method call: 10   ← IMPORTANT
*/