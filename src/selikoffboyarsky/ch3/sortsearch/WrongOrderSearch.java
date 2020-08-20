package selikoffboyarsky.ch3.sortsearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WrongOrderSearch {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(index); // -1, unpredictable result because we changed the order of the list
    }
}
