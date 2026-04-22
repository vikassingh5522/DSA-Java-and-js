public class binaryser 
// Binary Searching Algorithm


    public static void main(String[] args) {

        int arr[] = {-1,2,3,4,5,6,7,8,9,10};
        int target = 10;

        int li = 0;
        int ed = arr.length - 1;

        while (li <= ed) {

            
            int mid = (li + ed) / 2;

            if (arr[mid] == target) {
                System.out.println("Found: " + target);
                return;   // exit program
            }
            else if (arr[mid] < target) {
                li = mid + 1;
            }
            else if (arr[mid] > target) {
                ed = mid - 1;
            }
        }

        // if not found
        System.out.println("Element not found");
    }
}