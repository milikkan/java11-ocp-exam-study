package collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GenericList {
    public static void main(String[] args) {
        List stringList = new ArrayList();
        stringList.add("Fred");
        stringList.add(2);
        stringList.add(LocalDateTime.now());

        Object obj1 = stringList.get(2);
        System.out.println(obj1); // you can only use Object methods on obj1

//        String s = stringList.get(0); // compiler error
    }
}
