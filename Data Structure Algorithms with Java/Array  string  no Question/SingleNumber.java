public class SingleNumber {
    

    public static int singleNumber(int[] arr){
         int ans = 0;
          
         for(int i = 0; i< arr.length; i ++){
            ans = ans ^ arr[i];
         }
         return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 3, 2, 5, 7};
        int[] arr2 = {1, 1, 4, 2, 2};

        singleNumber(arr1);
        singleNumber(arr2);

        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));

    }
}
