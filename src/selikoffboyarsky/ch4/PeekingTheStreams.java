package selikoffboyarsky.ch4;

import java.util.stream.Stream;

public class PeekingTheStreams {
    public static void main(String[] args) {
        // snippet-1
        /*var infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .filter(n -> n % 2 == 1)
                .forEach(System.out::print);*/
        // output: 135

        // snippet-2
        /*var infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);*/
        // output: 11233455

        // snippet-3
        /*Stream.iterate(1, x -> x + 1)
                .filter(x -> x % 2 == 1)
                .limit(5)
                .forEach(System.out::print);*/
        // output: 13579

        // snippet-4
        Stream.iterate(1, x -> x + 1)
                .filter(x -> x % 2 == 1)
                .peek(System.out::print)
                .limit(5)
                .forEach(System.out::print);
        // output: 1133557799

    }
}
