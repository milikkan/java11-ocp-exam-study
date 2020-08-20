package selikoffboyarsky.ch4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateStreamOperations {
    static void filterDemo() {
        var s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::println);
    }
    static void distinctDemo() {
        var s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::println);
    }
    static void limitAndSkipDemo() {
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(5).limit(2).forEach(System.out::println);
    }
    static void mapDemo() {
        var s = Stream.of("monkey", "gorilla", "bonobo");
//        s.map(str -> str.length()).forEach(System.out::println);
        s.map(String::length).forEach(System.out::println);
    }
    static void flatMapDemo() {
        List<String> zero = Arrays.asList();
        var one = Arrays.asList("Bonobo");
        var two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(a -> a.stream()).forEach(System.out::println);
    }
    static void sortedDemo() {
        var s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print);
        System.out.println();
        s = Stream.of("brown bear-", "grizzly-");
        s.sorted(Comparator.reverseOrder()).forEach(System.out::print);
//        s.sorted((a, b) -> b.compareTo(a)).forEach(System.out::print); // same thing
    }
    static void peekDemo() {
        var s = Stream.of("black bear", "brown bear", "grizzly");
        long count = s.filter(name -> name.startsWith("b"))
                .peek(System.out::println)
                .count();
        System.out.println(count);
    }
    public static void main(String[] args) {
        // filterDemo();
        // distinctDemo();
        // limitAndSkipDemo();
        // mapDemo();
        // flatMapDemo();
        // sortedDemo();
        peekDemo();
    }
}
