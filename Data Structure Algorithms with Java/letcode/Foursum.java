import java.util.*;

public class Foursum {

    public static void main(String[] args) {
        
        int arr[] = {1, 0, -1, 0, -2, 2 };
        int target = 0 ;
        
        Arrays.sort(arr);

        ArrayList<List <Integer>> result = new ArrayList<>();

        for( int  i = 0 ; i < arr.length ; i++){
            for( int j  =  i + 1 ; j < arr.length ; j++ ){

                int start = j + 1;
                int end = arr.length - 1 ;

                while (start < end ) {
                    
                    int sum = arr[i]+arr[j]+arr[start]+arr[end];
                    
                    if(sum == target){
                        result.add(Arrays.asList(arr[i], arr[j] ,arr[start] , arr[end]));

                        start++;
                        end--;

                    }
                    else if (sum < target ){ 
                        start++;

                    }else{  // stat > target
                      end--;
                    }
                    
                }
            }
        }
    System.out.println(result);
    }
}