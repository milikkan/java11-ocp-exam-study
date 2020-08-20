package selikoffboyarsky.ch3;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
//        printList(keywords); // doesn't compile because List<String> is not a List<Object>
        printList(keywords); // compile when unbounded wildcard is used in th emethod parameter
//        List<Object> list = new ArrayList<String>(); // compiler error
        List<?> list = new ArrayList<String>(); // compiler error
        Integer[] numbers = { Integer.valueOf(42) };
        Object[] o2 = new Integer[2]; // OK
        Object[] o3 = new String[]{"a", "b"};
//        o3[1] = 2; /// ArrayStoreException at runtime
        Object[] o = numbers;
        o[0] = 5; // OK
        //o[0] = "forty-two"; // compiles but throws ArrayStoreException
    }
//    public static void printList(List<Object> list) {
    public static void printList(List<?> list) {
        for (Object x : list) System.out.println(x);
    }
}
