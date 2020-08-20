package selikoffboyarsky.ch3.review;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q19 {
    public static void main(String[] args) {
        List<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1); // removes the element at index 1 because of the List interface
        System.out.println(q); // [10]

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(10);
        q2.add(12);
        q2.remove(1); // tries to remobe Object 1 which is not present
        System.out.println(q2); // [10, 12]
    }
}
