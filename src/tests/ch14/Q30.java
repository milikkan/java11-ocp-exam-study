package tests.ch14;

import java.util.function.DoubleToIntFunction;

class Bank {
    int savingsInCents;

    static class ConvertToCents {
//        static DoubleToIntFunction f = p -> p * 100; // doesn't compile because return type must be int, not double
        static DoubleToIntFunction f = p -> (int) (p * 100); // OK
    }
}

public class Q30 {
    public static void main(String[] args) {
        Bank creditUnion = new Bank();
        creditUnion.savingsInCents = 100;
        double deposit = 1.5;

        creditUnion.savingsInCents += Bank.ConvertToCents.f.applyAsInt(deposit);
        System.out.println(creditUnion.savingsInCents); // 250
    }
}
