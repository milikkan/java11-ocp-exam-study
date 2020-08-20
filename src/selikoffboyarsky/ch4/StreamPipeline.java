package selikoffboyarsky.ch4;

import java.util.*;
import java.util.stream.Stream;

public class StreamPipeline {
    static List<String> names = Arrays.asList("Toby", "Anna", "Leroy", "Alex");

    // find the first two names alphabetically that are 4 characters long
    static void findNamesPreJava8() {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.length() == 4) result.add(name);
        }
        Collections.sort(result);
        Iterator<String> iter = result.iterator();
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());
    }

    // same with Java8 features
    static void findNamesJava8Func() {
        names.stream()
                .filter(name -> name.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        findNamesPreJava8();
        System.out.println("------------");
        findNamesJava8Func();

        // this code hangs because there is an infinite stream and sort cannot sort it
        /*Stream.generate(() -> "Elsa")
                .filter(s -> s.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);*/

        // works without hanging
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);

        // this code also hangs, because filter doesn't let any element and limit cannot limit 2 elements
        /*Stream.generate(() -> "Mustafa ILIKKAN")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);*/
    }
}
