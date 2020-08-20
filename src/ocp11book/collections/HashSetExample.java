package ocp11book.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        var numbers = new HashSet<Number>();
        numbers.add(Integer.valueOf(86));
        numbers.add(75);
        numbers.add(Integer.valueOf(86)); // Set doesn't add dublicates
        numbers.add(null); // HashSet allows null
        numbers.add(309L);
        Iterator iter = numbers.iterator();
        while (iter.hasNext())
            System.out.println(iter.next()); // print order isn't defined for Sets. safely prints null
    }
}
