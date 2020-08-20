package selikoffboyarsky.ch4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingCollectors {
    static void joiningDemo() {
        Stream<String> animals = Stream.of("lions", "tigers", "bears");
        String s = animals.collect(Collectors.joining(", "));
        System.out.println(s); // lions, tigers, bears
    }
    static void averagingDemo() {
        Stream<String> animals = Stream.of("lions", "tigers", "bears");
        Double d = animals.collect(Collectors.averagingInt(String::length));
        System.out.println("Average length of names: " + d); // 5.33333..
    }
    static void toCollectionDemo() {
        Stream<String> animals = Stream.of("lions", "tigers", "bears"); // source of stream
        TreeSet<String> result = animals.filter(s -> s.startsWith("t")) // intermediate op. (filter)
                .collect(Collectors.toCollection(TreeSet::new)); // terminal operation (collect)
        System.out.println(result); // [tigers]
    }
    static void toMapDemo() {
        // map animal names to their lengths
        Stream<String> animals = Stream.of("lions", "tigers", "bears");
//        Map<String, Integer> result = animals.collect(Collectors.toMap(s -> s, String::length));
        Map<String, Integer> result = animals.collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(result); // {lions=5, bears=5, tigers=6}

        // map animal lengths to their names
        animals = Stream.of("lions", "tigers", "bears");
        // throws IllegalStateException because there are duplicate keys and we didn't tell Collector what to do in this situation
        // Map<Integer, String> map = animals.collect(Collectors.toMap(s -> s.length(), Function.identity()));

        // we can use the 3rd argument, which is a function to merge values when there are duplicate keys
        Map<Integer, String> map = animals.collect(
                Collectors.toMap(
                        String::length,
                        s -> s,
                        (v1, v2) -> v1 + ", " + v2));
        System.out.println(map); // {5=lions, bears, 6=tigers}
        System.out.println(map.getClass()); // java.util.HashMap

        // if we want another type of Map, we can use the 4th param and supply the constructor ref.
        animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> treeMap = animals.collect(
                Collectors.toMap(
                        String::length,
                        s -> s,
                        (v1, v2) -> v1 + ", " + v2,
                        TreeMap::new));
        System.out.println(treeMap); // {5=lions, bears, 6=tigers}
        System.out.println(treeMap.getClass()); // java.util.TreeMap
    }
    static void groupingByDemo() {
        Stream<String> animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> mapWithList = animals.collect(
                Collectors.groupingBy(String::length));
        System.out.println(mapWithList); // {5=[lions, bears], 6=[tigers]}

        // we can convert the type of resulting collection using the downstream collector parameter
        // convert results to Set, rather than List
        animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> mapWithSet = animals.collect(
                Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(mapWithSet); // {5=[lions, bears], 6=[tigers]}

        // change the returning Map type, TreeMap here
        animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> treeMapWithSet = animals.collect(
                Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(treeMapWithSet); // {5=[lions, bears], 6=[tigers]}
        System.out.println(treeMapWithSet.getClass()); // java.util.TreeMap

        // returning TreeMap that has a List rather than a Set
        animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> treeMapWithList = animals.collect(
                Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(treeMapWithList); // {5=[lions, bears], 6=[tigers]}
    }
    static void partitioningByDemo() {
        Stream<String> animals = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> mapWithList = animals.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(mapWithList); // {false=[tigers], true=[lions, bears]}

        // we can change the type of List to Set or sth else using the downstream collector param.
        animals = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> mapWithSet = animals.collect(
                Collectors.partitioningBy(s -> s.length() <= 5, Collectors.toSet()));
        System.out.println(mapWithSet); // {false=[tigers], true=[lions, bears]}
    }
    static void countingDemo() {
        // group by the length of animal name as keys and see counts as values
        Stream<String> animals = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map = animals.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map); // {5=2, 6=1}
    }

    public static void main(String[] args) {
        joiningDemo();
        averagingDemo();
        toCollectionDemo();
        toMapDemo();
        groupingByDemo();
        partitioningByDemo();
        countingDemo();

    }
}
