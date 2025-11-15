import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        
        // String array
        String[] fruit = {"apple", "banana", "mango", "oranges"};
        System.out.println(fruit[3]); // oranges
        System.out.println(Arrays.toString(fruit));

        // int array
        int[] no = {10, 20, 30, 40, 60, 90, 70, 85};
        System.out.println(no[5]); // 90
        System.out.println(Arrays.toString(no));

        // float array
        float[] f1 = {1.2f, 12.0f, 110.1f, 77.8f};
        System.out.println(f1[2]); // 110.1
        System.out.println(Arrays.toString(f1));

        // double array
        double[] f2 = {1.111, 22.22, 333.3, 4444.44};
        System.out.println(f2[1]); // 22.22
        System.out.println(Arrays.toString(f2));

        // byte array
        byte[] b = {10, 20, 30};
        System.out.println(b[0]); // 10
        System.out.println(Arrays.toString(b));

        // short array
        short[] s = {1000, 2000, 3000};
        System.out.println(s[2]); // 3000
        System.out.println(Arrays.toString(s));

        // long array
        long[] l = {100000L, 200000L, 300000L};
        System.out.println(l[1]); // 200000
        System.out.println(Arrays.toString(l));

        // char array
        char[] c = {'A', 'B', 'C', 'D'};
        System.out.println(c[2]); // C
        System.out.println(Arrays.toString(c));

        // boolean array
        boolean[] flag = {true, false, true};
        System.out.println(flag[1]); // false
        System.out.println(Arrays.toString(flag));
    }
}
                                                                                                                           



// ✅ Remove import java.sql.Array; (you don’t need it).
// You only need import java.util.Arrays;.

// ✅ For double [] f2 = {} you must either initialize it with values or give a size.

// ✅ I’ll add arrays for all primitive types (byte, short, int, long, float, double, char, boolean) + String