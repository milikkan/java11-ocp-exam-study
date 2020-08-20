package selikoffboyarsky.ch3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);
        addsound(strings);
        addsound(objects);

        List<? super IOException> exceptions = new ArrayList<>();
//        exceptions.add(new Exception()); // compiler error
        exceptions.add(new IOException()); // OK
        exceptions.add(new FileNotFoundException()); // OK
        // although list can be passes places where IOException, Exception, Throwable or Exception is waited
        // we can only add IOException and its subclasses but not superclasses
    }


    // using unbounded wildcard
    // method doesn't compile -> unbounded generics are immutable
    // we can pass List<String>
    // we can pass List<Object>
    /*public static void addsound(List<?> list) {
        list.add("quack");
    }*/

    // using upper-bounded generics
    // doesn't compile -> upper-bounded generics are immutable
    // we can pass List<String>
    // we can pass List<Object>
    /*public static void addsound(List<? extends Object> list) {
        list.add("quack");
    }*/

    // using bounded type parameter
    // method compiles
    // wen can pass List<Object>
    // we cannot pass List<String>
    /*public static void addsound(List<Object> list) {
        list.add("quack");
    }*/

    // using lower-bounded generics
    // compiles
    // we can pass List<String>
    // we can pass List<Object>
    public static void addsound(List<? super String> list) {
        list.add("quack");
    }
}
