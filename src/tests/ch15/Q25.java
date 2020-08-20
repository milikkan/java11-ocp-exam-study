package tests.ch15;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q25 {
    public static void main(String[] args) {
        IntStream ints = IntStream.empty();
        IntStream moreInts = IntStream.of(66, 77, 88);
        Stream.of(ints, moreInts)
                .flatMapToInt(x -> x) // flattens Stream<IntStream> into InstStreams
                .forEach(System.out::print); // 667788
    }
}
