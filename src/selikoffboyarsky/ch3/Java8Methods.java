package selikoffboyarsky.ch3;

import java.util.*;
import java.util.function.BiFunction;

public class Java8Methods {
    static void removeIfDemo() {
        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list);

        list.removeIf(s -> s.startsWith("A")); // we cannot convert this lambda to method reference
        System.out.println(list);
    }

    static void replaceAllDemo() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list);
        list.replaceAll(x -> x * 2);
        System.out.println(list);
    }

    static void forEachDemo() {
        List<String> names = Arrays.asList("Fred", "Johnny", "Cali");
        names.forEach(System.out::println);
    }

    static void putIfAbsentDemo() {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        System.out.println(favorites);

        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        System.out.println(favorites);
    }

    static void mergeDemo() {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        favorites.put("Sam", null);
        System.out.println(favorites);

        BiFunction<String, String, String> remapper =
                (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        BiFunction<String, String, String> eraser = (v1, v2) -> null;

        String jenny = favorites.merge("Jenny", "Skyride", remapper);
        String tom = favorites.merge("Tom", "Skyride", remapper);
        favorites.merge("Sam", "Skyride", remapper);

        System.out.println(jenny);
        System.out.println(tom);
        System.out.println(favorites);

        favorites.merge("Jenny", "hedehde", eraser);
        System.out.println(favorites);
    }

    public static void main(String[] args) {
        // removeIfDemo();
        // replaceAllDemo();
        // forEachDemo();
        // putIfAbsentDemo();
        mergeDemo();
    }
}
