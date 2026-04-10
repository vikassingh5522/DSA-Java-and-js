class Box {
    int value;

    Box(int value) {
        this.value = value;
    }
}

public class PassByValueComplex {

    public static void main(String[] args) {

        int a = 5;

        Box b = new Box(10);

        System.out.println("Before process:");
        System.out.println("a = " + a);
        System.out.println("b.value = " + b.value);

        process(a, b);

        System.out.println("\nAfter process:");
        System.out.println("a = " + a);
        System.out.println("b.value = " + b.value);
    }

    public static void process(int x, Box obj) {
        System.out.println("\nInside process:");

        x = x + 10;                 // change primitive
        obj.value = obj.value + 20; // change object data

        modify(obj);
        reassign(obj);

        System.out.println("End process:");
        System.out.println("x = " + x);
        System.out.println("obj.value = " + obj.value);
    }

    public static void modify(Box obj) {
        System.out.println("\nInside modify:");
        obj.value = obj.value * 2; // modifies original object
    }

    public static void reassign(Box obj) {
        System.out.println("\nInside reassign:");
        obj = new Box(999); // new object (local only)
        obj.value = obj.value + 1;

        System.out.println("Reassigned obj.value = " + obj.value);
    }
}

/*
Before process:
a = 5
b.value = 10

Inside process:
Inside modify:
Inside reassign:
Reassigned obj.value = 1000

End process:
x = 15
obj.value = 60

After process:
a = 5          ← NOT changed
b.value = 60   ← changed
 */