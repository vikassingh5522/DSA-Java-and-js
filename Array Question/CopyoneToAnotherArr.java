public class CopyoneToAnotherArr {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int copy[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];

        }

        System.out.println("first arr element: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("sec arr lement :");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");

        }
    }
}
