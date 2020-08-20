package selikoffboyarsky.ch4.review;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q16 {
    public static void main(String[] args) {
        Stream<String> s = Stream.empty();
        Stream<String> s2 = Stream.empty();
        Map<Boolean, List<String>> p = s.collect(
                Collectors.partitioningBy(b -> b.startsWith("c")));
        // Collectors.partitioningBy always returns a Map with keys as "true" and "false"
        // eve if there are no values associated

        Map<Boolean, List<String>> g = s2.collect(
                Collectors.groupingBy(b -> b.startsWith("c")));
        // Collectors.groupingBy returns an empty Map if there are no matches

        System.out.println(p + " " + g); // {false=[], true=[]} {}
    }
}
