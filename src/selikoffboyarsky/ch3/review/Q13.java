package selikoffboyarsky.ch3.review;

import java.util.*;

class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }
}
public class Q13 {
    public static void main(String[] args) {
        Wildcard card = new Wildcard();

        // 1. doesn't compile. Although declaration is correct, ArrayDeque is not a list, it is a Queue
        // ArrayDeque<?> list = new ArrayDeque<String>();

        // 2. compiles OK.
        // ArrayList<? super Date> list = new ArrayList<Date>();

        // 3. doesn't compile.
        // List<?> list = new ArrayList<?>();

        // 4. doesn't compile
        // List<Exception> list = new LinkedList<java.io.IOException>();

        // 5. compiles OK
        Vector<? extends Number> list = new Vector<Integer>();

        card.showSize(list);
    }
}
