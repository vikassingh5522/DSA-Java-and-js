public class StringBuilderDemo {
    public static void main(String[] args) {

        String str = "Hello";
        StringBuilder sb = new StringBuilder();

        // Append operations
        sb.append(str);
        sb.append(" World");            // Hello World

        // Insert operation
        sb.insert(5, " Java");           // Hello Java World

        // Delete operation
        sb.delete(6, 11);                // Hello World

        // Replace operation
        sb.replace(6, 11, "Everyone");   // Hello Everyone

        // Reverse operation
        sb.reverse();                    // enoyrevE olleH

        // Reverse back (for further operations)
        sb.reverse();                    // Hello Everyone

        // setCharAt (SET attribute)
        sb.setCharAt(0, 'h');            // hello Everyone

        // setLength (SET attribute)
        sb.setLength(5);                 // hello

        // Capacity & length
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        System.out.println("Final StringBuilder value: " + sb);
    }
}
