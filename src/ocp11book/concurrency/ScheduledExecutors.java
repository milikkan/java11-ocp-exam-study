package ocp11book.concurrency;

import java.util.concurrent.*;

public class ScheduledExecutors {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService service = null;

        try {
            service = Executors.newSingleThreadScheduledExecutor();
            Runnable task1 = () -> System.out.println("Hello zoo");
            Callable<String> task2 = () -> "Monkey";
            ScheduledFuture<?> r1 = service.schedule(task1, 2, TimeUnit.SECONDS);
            ScheduledFuture<?> r2 = service.schedule(task2, 3, TimeUnit.SECONDS);
            System.out.println(r2.get());
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
