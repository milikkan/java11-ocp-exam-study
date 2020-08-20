package selikoffboyarsky.ch4.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {
    private static List<String> sort(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        return copy;
    }
    // same result using stream operations
    private static List<String> sort2(List<String> list) {
        return list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        var myList = Arrays.asList("5", "4", "1", "7", "3");
        System.out.println(sort(myList)); // [7, 5, 4, 3, 1]
        System.out.println(sort2(myList)); // [7, 5, 4, 3, 1]
    }
}
