public class Math {
    public static void main(String[] args) {

        // 1 --> negative to positive and positive to positive only
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));

        // 2 --> increase the value by 1 (ceil)
        System.out.println(Math.ceil(20.3));

        // 3 --> floor (remove decimals)
        System.out.println(Math.floor(10.779));

        // 4 --> round to nearest integer
        System.out.println(Math.round(13.5));
        System.out.println(Math.round(12.2));

        // 5 --> trunc (Java does NOT have Math.trunc, but casting does the job)
        System.out.println((int)47.888666);  // truncate

        // 6 --> power
        System.out.println(Math.pow(10, 3));

        // 7 --> max
        System.out.println(Math.max(17, Math.max(12, Math.max(36, 99))));

        // 8 --> min
        System.out.println(Math.min(1, Math.min(4, Math.min(2, Math.min(6, 33)))));

        // 9 --> random (0–1)
        System.out.println(Math.random());

        // 10 --> toFixed equivalent (format number)
        System.out.println(String.format("%.2f", 47.888));
    }
}
