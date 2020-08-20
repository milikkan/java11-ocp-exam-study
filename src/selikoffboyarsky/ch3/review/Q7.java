package selikoffboyarsky.ch3.review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q7 {
    public static void main(String[] args) {
        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));
        numbers.add(null); // HashSet allows null values
        numbers.add(309L); // we can add ints or longs, since type parameter is Number
        Iterator iter = numbers.iterator(); // raw iterator, assumes Object
        while (iter.hasNext())
            System.out.println(iter.next()); // no problem
        // because HashSet doesn't preserve sorted order, result of the print is unpredictable
    }
}
