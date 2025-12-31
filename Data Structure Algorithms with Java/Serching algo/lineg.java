public class lineg {

    public static void main(String[] args) {

        int[] ar = { 5, 3, 6, 1, 4, 2 };

        int item = 9; // searching for element 3

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == item) {
                System.out.println("Item found at index: " + i);
                
                break;
            }
        }
    }
}
