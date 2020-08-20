package selikoffboyarsky.ch3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonCollectionMethods {
    public static void main(String[] args) {
        // add()
        System.out.println("add()");
        List<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true
        System.out.println("----------------");
        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false
        System.out.println("----------------");

        // remove()
        System.out.println("remove()");
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk"); // ["hawk", "hawk"]
        System.out.println(birds.remove("cardinal")); // false
        System.out.println(birds.remove("hawk")); // true
        System.out.println(birds); // ["hawk"]
        System.out.println("----------------");
//        birds.remove(100); // ArrayIndexOutOfBounds exception

        // isEmpty(), size(), clear()
        List<String> birds2 = new ArrayList<>();
        birds2.add("hawk");
        birds2.add("hawk");
        System.out.println(birds2.isEmpty()); // false
        System.out.println(birds2.size()); // 2
        birds2.clear(); // []
        System.out.println(birds2.isEmpty()); // true
        System.out.println(birds2.size()); // 0
        System.out.println("----------------");

        // contains()
        birds2.add("hawk");
        System.out.println(birds2.contains("hawk")); // true
        System.out.println(birds2.contains("robin")); // false

    }
}
