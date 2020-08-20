package selikoffboyarsky.ch3.review;

import java.util.TreeSet;

public class Q8 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        // TreeSet preserves order when adding objects
        // but objects must be comparable
        // string is comparable 1. numbers 2. uppercase 3. lowercase letter
        tree.add("one");
        tree.add("One");
        tree.add("ONE");

        // System.out.println(tree); // ONE, One, one

        System.out.println(tree.ceiling("On")); // One -- because "On" stands between ONE and One
        // and ceiling() returns smallest element greater than (or equal to) the specified

    }
}
