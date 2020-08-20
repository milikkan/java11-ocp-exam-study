package selikoffboyarsky.ch3.review;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q15 {
    public static void main(String[] args) {
        Comparator<Integer> c = (o1, o2) -> o2 - o1; // defines a descending sort order
        List<Integer> list = Arrays.asList(5, 4, 7, 1);
        Collections.sort(list, c);
        // System.out.println(Collections.binarySearch(list, 1)); // result is undefined
        // the list is sorted in descending order
        // However, we are searching using the default order, which is ascending.

        // correct usage
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 1, c)); // pass the same comparator

    }
}
