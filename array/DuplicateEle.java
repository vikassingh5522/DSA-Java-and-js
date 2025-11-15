import java.util.HashSet;

public class DuplicateEle {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 50, 70, 80, 20 };

        
        System.out.println("dub element:-");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print( arr[i] + " ");
                    break;
                }
            }
        }
         

        // or
        System.out.println("==============================");

        HashSet <Integer> ob1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            
            ob1.add(arr[i]);
        }
        System.out.println("array duplication "+ob1);
    }
}
