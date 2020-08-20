package tests.ch15;

import java.util.stream.Stream;

public class Q2 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i + 1);

        boolean b = stream.anyMatch(i -> i > 5);
        System.out.println(b); // true

        stream = Stream.iterate(1, i -> i + 1);
        b = stream.noneMatch(i -> i > 5);
        System.out.println(b); // false

        stream = Stream.iterate(1, i -> i + 1);
        b = stream.allMatch(i -> i > 5);
        System.out.println(b); // false
    }
}
