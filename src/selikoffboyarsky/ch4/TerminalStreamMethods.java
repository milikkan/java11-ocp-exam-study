package selikoffboyarsky.ch4;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalStreamMethods {
    public static void main(String[] args) {
        // count()
        var s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count());

        // min() and max()
        s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        //Optional<String> min = s.min(Comparator.comparingInt(String::length));
        min.ifPresent(System.out::println);

        // try with an empty stream
        var minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());

        // findFirst() and findAny()
        s = Stream.of("monkey", "gorilla", "bonobo");
        var infiniteStream = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println);
        infiniteStream.findAny().ifPresent(System.out::println);

        // anyMatch(), allMatch(), noneMatch()
        var list = Arrays.asList("monkey", "2", "chimp");
        var infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
//        var pred = x -> Character.isLetter(x.charAt(0)); // cannot use var, type isn't inferrable
        System.out.println(list.stream().anyMatch(pred)); // true
        // we need to start a new stream every time
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite.anyMatch(pred)); // true, since one match is found, stream is terminated
//        System.out.println(infinite.allMatch(pred)); // stream keeps running until we kill the program

        // reduce
        Stream<String> stream = Stream.of("w", "o", "l", "f");
//        String word = stream.reduce("", (str, ch) -> str + ch);
        String word = stream.reduce("", String::concat);
        System.out.println(word);

        var numStream = Stream.of(3, 5, 6);
        System.out.println(numStream.reduce(1, (a, b) -> a * b)); // 90

        BinaryOperator<Integer> op = (num1, num2) -> num1 * num2;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println); // no output when stream is empty
        oneElement.reduce(op).ifPresent(System.out::println); // one element is returned without the acc not applied
        threeElements.reduce(op).ifPresent(System.out::println); // 90

        // collect
        stream = Stream.of("w", "o", "l", "f");
        // accumulator and combiner have same logic
        StringBuilder sb = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(sb); // wolf

        stream = Stream.of("w", "o", "l", "f");
        // accumulator and combiner have different logic
        var set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]

        // using collector as argument
        stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> treeSet = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); // [f, l, o, w]

        // if we don't need the set to be sorted, there is a shorter way
        stream = Stream.of("w", "o", "l", "f");
        Set<String> mySet = stream.collect(Collectors.toSet());
        System.out.println(mySet); // [f, w, l, o]
    }
}
