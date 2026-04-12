


public class palindrome {


    public static void main(String[] args) {
        
        String str = "moi";
        char arr[] = str.toCharArray();
       int  start = 0 ; 
        int end = str.length() - 1;
        char tmep;

        boolean ispal = true ;

        while (start < end) {
           if(arr[start] != arr[end]){
            ispal =false;
            break;
           }
           
           start++;
           end--;
        }

        if(ispal){
            System.out.println("it is pal"+ispal);
        }else{
            System.out.println("it is not apl"+ispal);
        }
    }
    
}