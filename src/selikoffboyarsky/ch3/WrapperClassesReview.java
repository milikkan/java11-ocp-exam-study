package selikoffboyarsky.ch3;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassesReview {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1); // auto-boxing
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        numbers.remove(1); // removes 2nd element which is 3
        numbers.remove(new Integer(5)); // remove element 5
//        numbers.remove(Integer.valueOf(5)); // remove element 5
        System.out.println(numbers); // [1]
        int num = numbers.get(0); // auto-unboxing
        System.out.println(num);
    }
}
