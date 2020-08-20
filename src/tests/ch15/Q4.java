package tests.ch15;

import java.util.stream.Stream;

public class Q4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("base", "ball");
        stream.map(s -> s.length()).forEach(System.out::print); // 44

        System.out.println();

        stream = Stream.of("base", "ball");
        stream.mapToInt(s -> s.length()).forEach(System.out::print); // 44
    }
}
