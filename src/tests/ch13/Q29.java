package tests.ch13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ExtendingGenerics {
    static <T extends Collection<U>, U> U add(T list, U element) {
    // static <? extends Collection<U>, U> U add(T list, U element) {
        // above line doesn't compile because ? (wildcard) isn't allowed in declarations
        list.add(element);
        return element;
    }
}

public class Q29 {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        ExtendingGenerics.add(values, "duck");
        ExtendingGenerics.add(values, "duck");
        ExtendingGenerics.add(values, "goose");
        System.out.println(values);
    }

}
