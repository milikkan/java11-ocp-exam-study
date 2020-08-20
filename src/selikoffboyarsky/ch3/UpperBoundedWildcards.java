package selikoffboyarsky.ch3;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcards {
    static class Bird {}
    static class Sparrow extends Bird {}

    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>(); // compiler error
        List<? extends Number> list = new ArrayList<Integer>(); // OK
//        list.add(3); // compiler error, cannot add elements

        List<? extends Bird> birds = new ArrayList<>();
//        birds.add(new Sparrow()); // compiler error
//        birds.add(new Bird()); // compiler error

    }
    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number num : list) {
            count += num.longValue();
        }
        return count;
    }
}
