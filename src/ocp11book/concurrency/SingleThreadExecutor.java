package ocp11book.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = null;

        Runnable task1 = () -> System.out.println("Printing zoo inventory");

        Runnable task2 = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing record: " + i);
            }
        };
        // With a single-thread executor, results are guaranteed to be executed sequentially.
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("BEGIN");
            service.execute(task1);
            service.execute(task2);
            service.execute(task1);
            System.out.println("END");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
