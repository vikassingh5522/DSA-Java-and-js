import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class productofmultiple {

    public static void main(String[] args)
    {
        int arr[] = {10, 20, 5 ,40 , 30,7,5 ,9 ,10 };
        
        List<Integer> nonMul = new ArrayList<>();
        List<Integer> Mult = new ArrayList<>();

        // Separate numbers
        for(int num : arr){
            if(num % 10 == 0){
                Mult.add(num);
            }else{
                nonMul.add(num);
            }
        }

        int index = 0;

        // add non multiples first
        for(int num : nonMul){
            arr[index++] = num;
        }

        // add multiples of 10
        for(int num : Mult){
            arr[index++] = num;
        }

        System.out.println(Arrays.toString(arr));
    }
}