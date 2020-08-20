package selikoffboyarsky.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferences {
    public static void main(String[] args) {
        // 1. static methods
        Consumer<List<Integer>> lambda1 = list -> Collections.sort(list);
        Consumer<List<Integer>> methodRef1 = Collections::sort;

        /*List<Integer> myList = Arrays.asList(2, 11, 55, 4);
        System.out.println(myList);
        lambda1.accept(myList);
        System.out.println(myList);*/

        // 2. instance method on a specific instance
        String str = "abc";
        Predicate<String> lambda2 = s -> str.startsWith(s);
        Predicate<String> methodRef2 = str::startsWith;

        System.out.println(lambda2.test("a")); // true
        System.out.println(methodRef2.test("z")); // false

        // 3. instance method on an instance to be determined at runtime
        Predicate<String> lambda3 = s -> s.isEmpty();
        Predicate<String> methodRef3 = String::isEmpty;

        System.out.println(lambda3.test("a")); // false
        System.out.println(methodRef3.test("")); // true

        // 4. constructor reference
        Supplier<ArrayList<String>> lambda4 = () -> new ArrayList<>();
        Supplier<ArrayList<String>> methodRef4 = ArrayList::new;

        List<String> l = lambda4.get();
        List<String> l2 = methodRef4.get();
    }
}
