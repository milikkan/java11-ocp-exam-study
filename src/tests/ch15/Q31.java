package tests.ch15;

import java.util.stream.Stream;

public class Q31 {
    public static void main(String[] args) {
        Stream<Character> stream = Stream.of('c', 'b', 'a');
        System.out.println(stream.sorted().findFirst()); // prints Optional[a]

        stream = Stream.of('c', 'b', 'a');
        System.out.println(stream.sorted().findFirst().get()); // prints a
    }
}
