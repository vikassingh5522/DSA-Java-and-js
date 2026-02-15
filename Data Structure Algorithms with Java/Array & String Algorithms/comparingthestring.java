public class comparingthestring {

    public static void main(String[] args) {
        
        String s1 = "vikas";
        String s2 = "raj";


        // in java the string are object .

        // s1 > s2 => +ve value
        // s1 == s2 => 0
        // s1 < s2 => -ve value

        if (s1.compareTo(s2)==0) {
            System.out.println("both string are same");
        }else
        {
            System.out.println("both string are different");
        }


        // some time == not work because it compare the reference of the string not the value of the string
        // if (s1 == s2) {
        //     System.out.println("both string are same");
        // }else
        // {
        //     System.out.println("both string are different");
        // }  
    }
    
}

