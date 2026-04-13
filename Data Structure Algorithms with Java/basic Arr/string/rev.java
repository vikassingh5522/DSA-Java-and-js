
public class rev {

    public static void main(String[] args) {
    

        String name = "vikas ";

        char arr[] = name.toCharArray();
        char tmep ;
        int st = 0 ;
        int end = name.length() - 1;


        while (st< end) {

            tmep = arr[st];
            arr[st] = arr[end];
            arr[end] = tmep;

            st++;
            end--;
            
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}