package ocp11book.concurrency.safety;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
    private int sheepCount = 0;

    // to make it safer we can use AtomicInteger
    private AtomicInteger sheepCountAtomic = new AtomicInteger(0);

    private void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
    }

    // we also need to update our method
    /*private void incrementAndReportAtomic() {
        System.out.print(sheepCountAtomic.incrementAndGet() + " ");
    }*/

    // synchronized version, now the output will be in order
    // also we don't need to use atomic now

/*    private void incrementAndReportSynch() {
        synchronized (this) {
            System.out.print((++sheepCount) + " ");
        }
    }*/

    // this is equivalent to the above
    private synchronized void incrementAndReportSynch() {
        System.out.print((++sheepCount) + " ");
    }

    public static void main(String[] args) {
        // Program may output numbers in a different order.
        // Worse yet, it may print some numbers twice and not print some numbers at all!
        // because increment operator (++) isn't thread safe
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
//                service.submit(() -> manager.incrementAndReport()); // use atomic version
                service.submit(() -> manager.incrementAndReportSynch()); // all numbers will be printed but order isn't guaranteed
            }
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
