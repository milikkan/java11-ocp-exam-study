package tests.ch14;

import java.util.function.IntUnaryOperator;

class TicketTaker {
    static int AT_CAPACITY = 100;

//    public int takeTicket(int currentTicket, IntUnaryOperator<Integer> counter)
// IntUnaryOperator doesn't take type parameter
    public int takeTicket(int currentTicket, IntUnaryOperator counter) { // correct line
        return  counter.applyAsInt(currentTicket);
    }
}

public class Q8 {
    public static void main(String[] args) {
        final TicketTaker bob = new TicketTaker();
        final int oldCount = 50;

        final int newCount = bob.takeTicket(oldCount, t -> {
            if (t > TicketTaker.AT_CAPACITY) {
                throw new RuntimeException("Sorry, max has been reached!");
            }
            return t + 1;
        });
        System.out.println(newCount); // 51
    }
}
