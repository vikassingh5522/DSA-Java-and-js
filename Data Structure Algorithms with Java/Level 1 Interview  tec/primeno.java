import java.util.*;

class primeno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size: ");
        int no = sc.nextInt();
        int arr[] = new int[no];
        System.out.println("Enter the array elements: ");
        for(int i=0 ; i <no ; i++){
            arr[i] =sc.nextInt();
        }

        for(int i = 0 ;i < no ; i++){
                int cout = 0;
                int prime = arr[i];
                for(int j = 1 ; j <= prime;j++){
                    if( prime % j  == 0){
                        cout++;
                    }
                }
                if(cout == 2){
                    System.out.println("it is a prime number: "+prime);
                }
                else{
                    System.out.println("it is not a prime number: "+prime);
                }
        }
        
        sc.close();
        
    }
}