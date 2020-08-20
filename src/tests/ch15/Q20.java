package tests.ch15;

import java.util.Comparator;
import java.util.stream.Stream;

public class Q20 {
    public static void main(String[] args) {
        Stream<String> s = Stream.of(
                "over the river",
                "through the woods",
                "to grandmother's house we go");
        s.filter(n -> n.startsWith("t"))
                .sorted(Comparator.reverseOrder())
//                .sorted(Comparator::reverseOrder()) // compiler error, cannot be used as method reference
                .findFirst()
                .ifPresent(System.out::println); // to grandmother's house we go
    }
}
