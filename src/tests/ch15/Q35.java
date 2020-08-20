package tests.ch15;

import java.util.*;
import java.util.stream.Stream;

public class Q35 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("tire-");

        List<String> list = new LinkedList<>();

        Deque<String> deque = new ArrayDeque<>();
        deque.push("wheel-");

        Stream.of(set, list, deque)
//                .flatMap(x -> x) // doesn't compile
                .flatMap(x -> x.stream())
                .forEach(System.out::print)
        ;
    }
}
