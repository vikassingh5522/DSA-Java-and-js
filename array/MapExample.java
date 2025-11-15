import java.util.*;
import java.util.stream.*;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // map() using Streams
        List<Integer> doubled = numbers.stream()
                                       .map(n -> n * 2) // mapping logic
                                       .collect(Collectors.toList());

        System.out.println(doubled); // [2, 4, 6, 8, 10]
    }
}
