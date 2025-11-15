import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        
        int arr1[] = {1, 2, 3, 5, 6, 8};
        int arr2[] = {4, 5, 6, 8};

        // merged array with size = arr1 + arr2
        int Merg[] = new int[arr1.length + arr2.length];

        // copy arr1 into Merg
        System.arraycopy(arr1, 0, Merg, 0, arr1.length);

        // copy arr2 into Merg after arr1
        System.arraycopy(arr2, 0, Merg, arr1.length, arr2.length);

        // print merged array
        System.out.println("Merged Array: " + Arrays.toString(Merg));
    }
}
