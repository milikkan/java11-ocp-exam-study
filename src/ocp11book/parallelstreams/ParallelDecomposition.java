package ocp11book.parallelstreams;

import java.util.List;

public class ParallelDecomposition {
    private static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        return input;
    }

    private static void doWorkSerial() {
        List.of(1, 2, 3, 4, 5)
                .stream()
                .map(w -> doWork(w))
                .forEach(s -> System.out.print(s + " "));
    }

    private static void doWorkParallel() {
        List.of(1, 2, 3, 4, 5)
                .parallelStream()
                .map(w -> doWork(w))
//                .forEach(s -> System.out.print(s + " "));
                .forEachOrdered(s -> System.out.print(s + " ")); // to get the results ordered we can use this method
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //doWorkSerial();
        doWorkParallel();
        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Time: " + timeTaken + " seconds");
    }
}
