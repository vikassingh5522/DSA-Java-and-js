

public class revthestring {

    public static void main(String[] args) {
        
        //using ch
        // char[] ch = {'h', 'e', 'l', 'l', 'o'};
        
        // using string 
         String str = " programmer!";
         char ch[] = str.toCharArray();
        

        int start = 0;
        int end = ch.length-1;
        char temp;

        while (start < end) {
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start ++;
            end --;

        }

        // for (char c : ch) {
        //     System.out.print(c + " ");
        // }
        

         String reversed = new String(ch);
        System.out.println(reversed);
    }
    
}
