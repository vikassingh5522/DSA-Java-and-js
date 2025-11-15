
public class fibonacci {

    public static void main(String[] args) {

        int no = 10, first = 0, secound = 1, next;

        for (int i = 1; i < no; i++) {
            System.out.print(first + ",");
            next = first + secound;
            first = secound;
            secound = next;
        }
    }
}
