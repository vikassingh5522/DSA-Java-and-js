


public class palindrome {

    public static void main(String[] args) {
        String name = "moma";

        char str[] = name.toCharArray();
          
        int start = 0 ; 
        int end = name.length() - 1;
        
       boolean ispal = true;

        while (start < end) {
             if(str[start] != str[end]){
                ispal = false;
                break;
             }

             start++;
             end--;
        }


        if(ispal){
            System.out.println("it is a pal");
        }else{
        System.out.println("not a pal");
        }
    }
}