package selikoffboyarsky.ch3.review;

import java.util.ArrayDeque;

public class Q4 {
    public static void main(String[] args) {
        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();
        // iterating a queue without using iterator
        while (greetings.peek() != null)
            System.out.print(greetings.pop());
    }
}
