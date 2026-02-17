
/*1.
You have given a character array of credit number and your task is to chang middle four character into #
Constraints : array length is always even and greater or equal to 6
Have to implement the logic with O(1) Time Complexity;
Ex1 :
Input [1 2 3 4 5 6]
Output : [1 # # # # 6]
Input : [1 2 3 4 5 6 7 8 9 0]
Output : [1 2 3 # # # # 8 9 0]
 */




public class MaskCreditCard {

    public static void maskMiddle(char[] arr) {
        int n = arr.length;

        int start = (n / 2) - 2;

        for (int i = start; i < start + 4; i++) {
            arr[i] = '#';
        }
    }

    public static void main(String[] args) {
        char[] arr = {'1','2','3','4','5','6','7','8','9','0'};
        maskMiddle(arr);

        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
