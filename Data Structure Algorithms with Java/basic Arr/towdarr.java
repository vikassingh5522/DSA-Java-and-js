
public class towdarr {

    public static void main(String[] args) {

        int arr[][] = new int[3][4];

        int b[][] = { { 1, 2 }, // row 0 coloum 0
                      { 2, 3 },
                       { 3, 4 },
                       { 4, 5 }
        };

        // System.out.println(b[3][0]); // row[] and clor[]

        // Outer loop for row, inner loop for column 

        for( int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nArray b:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}