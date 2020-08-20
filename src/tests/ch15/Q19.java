package tests.ch15;

import java.util.*;
import java.util.stream.Stream;

public class Q19 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("tire-");

        List<String> list = new LinkedList<>();

        Deque<String> queue = new ArrayDeque<>();
        queue.push("wheel-");

        Stream.of(set, list, queue)
                .flatMap(x -> x.stream()) // transforms Stream<Collection<String>> to Stream<String>
                .forEach(System.out::print); // tire-wheel-
    }
}
