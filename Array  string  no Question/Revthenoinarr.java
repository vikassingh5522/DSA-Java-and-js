public class Revthenoinarr {
    public static void main(String[] args) {

        int[] no = {1, 2, 3, 4, 5, 6};
        int start = 0;
        int end = no.length - 1;
        int temp;

        while (start < end) {
             temp = no[start];
            no[start] = no[end];
            no[end] = temp;

            start++;
            end--;
        }

        for (int rev : no) {
            System.out.print(rev + " ");
        }
    }
}
