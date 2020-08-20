package tests.ch15;

import java.util.stream.Stream;

public class Q15 {
    public static void main(String[] args) {
        Stream<Character> stream = Stream.of('c', 'b', 'a');
        stream.sorted()
                .findAny()
                .ifPresent(System.out::println);
        // most probably prints "a" for a sequential stream, but anyways, the behaviour is unexpected
    }
}
