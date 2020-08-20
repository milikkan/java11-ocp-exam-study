package selikoffboyarsky.ch4.review;

import java.util.stream.Stream;

public class StreamIncrement {
    public static void main(String[] args) {
        Stream.iterate(1, x -> x++)
                .limit(5)
                .forEach(System.out::print);
    }
}
