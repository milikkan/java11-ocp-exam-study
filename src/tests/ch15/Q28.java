package tests.ch15;

import java.util.stream.Stream;

public class Q28 {
    public static void main(String[] args) {
        Stream<Character> chars = Stream.generate(() -> 'a');
        chars.filter(c -> c < 'b')
                .sorted() // infinitely runs because sorted can never sort infinite stream of values
                .findFirst()
                .ifPresent(System.out::println);
    }
}
