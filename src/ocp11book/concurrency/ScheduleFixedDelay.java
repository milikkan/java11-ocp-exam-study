package ocp11book.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleFixedDelay {
    public static void main(String[] args) throws Exception {
//        ExecutorService service = Executors.newSingleThreadScheduledExecutor();
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(
                () -> System.out.println("Open zoo"),
                0, 2, TimeUnit.SECONDS);
        var result = service.submit(() -> System.out.println("Wake staff"));
        System.out.println(result.get()); // null
        service.shutdown();
    }
}
