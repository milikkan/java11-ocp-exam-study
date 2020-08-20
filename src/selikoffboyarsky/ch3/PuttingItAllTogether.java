package selikoffboyarsky.ch3;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}
class C extends B {}

public class PuttingItAllTogether {
    public static void main(String[] args) {
        // compiles fine.
        // ArrayList can hold instances of A.
        // ArrayList is assigned to a List that is defined as an unbounded wildcard
        // any generic type can be referenced from an unbounded wildcard
        List<?> list1 = new ArrayList<A>();

        // compiles fine
        // List reference variable is defined as an upperbound wildcard
        // We can store ArrayLists of A, B and C in this reference (but not object)
        List<? extends A> list2 = new ArrayList<A>();

        // compiles fine
        // list ref is defined as a lowerbound wildcard
        // we can store ArrayLists of A and Object in this reference (but not B or C)
        List<? super A> list3 = new ArrayList<A>();

        // doesn't compile
        // ref is an upper bound wildcard of B that can refer to ArrayLists of B and C, but not A
//        List<? extends B> list4 = new ArrayList<A>();

        // compiles fine
        // ref is a lower bound wildcard of B that can refer to ArrayLists of B, A, Object
        List<? super B> list5 = new ArrayList<A>();

        // doesn't compile because type for the instantiation of ArrayList is unknown
//        List<?> list6 = new ArrayList<? extends A>();
    }

    // compiles fine
    <T> T method1(List<? extends T> list) {
        return list.get(0);
    }

    // doen't compile because there is no clear return type
    // we cannot use wildcards as return type
    /*<T> <? extends T> method2(List<? extends T> list) {
        return list.get(0);
    }*/

    // doesn't compile
    // within the method scope B refers to the generic type parameter B, not the class B
    // B cannot be instantiated
    /*<B extends A> B method3(List<B> list) {
        return new B();
    }*/


    // compiles fine
    void method4(List<? super B> list) {

    }

    // doesn't compile
    // wilcard must include ?, bound unknown here
    /*<X> void method5(List<X super B> list) {

    }*/
}
