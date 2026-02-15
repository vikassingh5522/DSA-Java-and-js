public class BubbleSortAlg {
    public static void main(String[] args) {

        int arr[] = {36, 19, 29, 12, 5, 8 ,10 , 30 , 40 ,50 , 60 , 70 ,58 ,885 ,999,455 };
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            // int flag = 0;  // reset flag before each pass ==>if there is more number and  large  number  need 

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // flag = 1;  // mark swap happened
                }
            }

            // ✅ break if no swaps happened in this pass
            // if (flag == 0) {
            //     break;
            // }
        }

        // ✅ print final sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
