public class FristLargestEle {

    public static int FindLargestElement(int arr[]) {

        int firstno = arr[0];  // assume first number is largest

        // for-each loop
        for (int num : arr) {
            if (num > firstno) {
                firstno = num;
            }
        }

        return firstno;
    }

    public static void main(String[] args) {

        int arr[] = {90, 80, 10, 20, 50, 70};

        int largestvalue = FindLargestElement(arr);

        System.out.println("largest value is : " + largestvalue);
    }
}
