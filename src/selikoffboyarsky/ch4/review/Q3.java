package selikoffboyarsky.ch4.review;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q3 {
    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> stream = Stream.iterate("-", (s) -> s + s);
        boolean b1 = stream.noneMatch(predicate); // false
        boolean b2 = stream.anyMatch(predicate); // throws IllegalStateException because a closed stream is used
        System.out.println(b1 + " " + b2); // execution never reaches here
    }
}
