package selikoffboyarsky.ch3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopingThroughList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Joe", "Bob", "Mary", "Jane", "Jack");
        System.out.println(names);

        // using enhanced for loop
        for (String name : names) System.out.println("> " + name);

        // using iterator without generics, pre Java5
        Iterator iter = names.iterator();
        while (iter.hasNext()) {
            String name = (String) iter.next(); // cast is needed
            // iter.next(); // result in runtime exception when called before hasNext()
            System.out.println(">> " + name);
        }

        // using iterator with generics
        Iterator<String> iter2 = names.iterator();
        while (iter2.hasNext()) System.out.println(">>> " + iter2.next());
     }
}
