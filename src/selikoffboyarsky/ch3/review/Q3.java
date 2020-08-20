package selikoffboyarsky.ch3.review;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add(7); // no problem, since no generics code compiles with every object
//        for (String s : list) doesn't compile
        for (Object s : list) // now compiles and runs successfully
            System.out.println(s);
    }
}
