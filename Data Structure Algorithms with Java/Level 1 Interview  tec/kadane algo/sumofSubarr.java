
import java.util.*;

// max of sub arr

class sumofSubarr {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of arr :");
		int size = sc.nextInt();

		int arr [] = new int[size];
		System.out.print("Enter the element no : ");
		for(int i = 0  ; i < size ; i++) {
			arr[i] =sc.nextInt();

		}

		int maxsub = arr[0];
		
		for( int start  = 0 ; start < size ; start++) {
			int curentsum = 0 ;
			for( int end = start ; end < size ; end++) {
			    
			    curentsum += arr[end];
			    
				if(curentsum > maxsub) {
					maxsub =curentsum ;
				}
			}
		}
		System.out.print(" max sum of sub arr : "+ maxsub);

      sc.close();
	}
}