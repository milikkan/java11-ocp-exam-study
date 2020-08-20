package selikoffboyarsky.ch3;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithGenerics {

    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
//        List names = new ArrayList();
        List<String> names = new ArrayList<>(); // when we use generics, code doesn't compile

        names.add("Webby"); // this works
        //names.add(new StringBuilder("Webby")); // but this doesn't, ClassCastException
        // a non-generic list can contain every type of object
        // generics fix this by allowing us to write and use parameterized types
        printNames(names);
    }
}
