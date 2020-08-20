package selikoffboyarsky.ch3;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMethods {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();

        for (int i = 1; i <= 20; i++) set.add(i);

        System.out.println(set.lower(10)); // 9
        System.out.println(set.floor(10)); // 10
        System.out.println(set.ceiling(20)); // 20
        System.out.println(set.higher(10)); // 11
        System.out.println(set.lower(1)); // null
        System.out.println(set.higher(20)); // null
    }
}
