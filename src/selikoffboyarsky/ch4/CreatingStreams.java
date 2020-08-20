package selikoffboyarsky.ch4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        // empty stream
        Stream<String> empty = Stream.empty();
        // stream of one element
        Stream<Integer> singleElement = Stream.of(1);
        // multi elements
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        // from list
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();

        // infinite streams
        Stream<Double> randoms = Stream.generate(Math::random);
//        randoms.forEach(System.out::println); // prints random numbers until you kill
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
    }
}
