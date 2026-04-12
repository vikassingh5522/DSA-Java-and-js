
public class countlength {

    public static int countLengthStr(String name) {
        char[] arr = name.toCharArray();
        int len = arr.length;
        return len;
    }

    public static void main(String[] args) {
        String name = " vikas singh";
        System.out.println(countLengthStr(name));
    }
}