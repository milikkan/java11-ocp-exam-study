package selikoffboyarsky.ch3;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMethods {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        System.out.println(que.offer(10)); // true
        System.out.println(que.offer(4)); // true
        System.out.println(que.peek()); // 10
        System.out.println(que.poll()); // 10
        System.out.println(que.poll()); // 4
        System.out.println(que.peek()); // null
        System.out.println("-------------");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10); // stack: 10
        stack.push(4); // stack: 4, 10
        System.out.println(stack.peek()); // 4 - stack: 4, 10
        System.out.println(stack.poll()); // 4 - stack: 10
        System.out.println(stack.poll()); // 10 - stack: -
        System.out.println(stack.peek()); // null
    }
}
