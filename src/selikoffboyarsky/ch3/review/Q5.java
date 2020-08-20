package selikoffboyarsky.ch3.review;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        //1. doesn't compile
        // HashSet<Number> hs = new HashSet<Integer>();

        // 2. compiles OK
        HashSet<? super ClassCastException> set = new HashSet<Exception>();

        // 3. compiles OK
        List<String> list = new Vector<String >();

        // 4. doesn't compile
        // List<Object> values = new HashSet<Object>();

        // 5. doesn't compile
        // List<Object> objects = new ArrayList<? extends Object>();

        // 6. compiles OK
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
