package string;

// print the crrect of string 

public class charofstring {

    public static void printstr(String name) {

        int no = name.length();
        for (int i = 0; i < no; i++) {
            char st  = name.charAt(i);
            System.out.print(st);
        }
    }

    public static void main(String[] args) {

        String name = " vikas singh";
         printstr(name);

    }
}