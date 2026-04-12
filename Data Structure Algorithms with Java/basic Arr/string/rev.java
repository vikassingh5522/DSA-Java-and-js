

public class rev {

    public static void main(String[] args) {

        String str = "vikas singh is king ";

        char arr[] = str.toCharArray();
        int s = 0;
        int e = str.length() - 1;
        char temp;

        while (s < e) {
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}