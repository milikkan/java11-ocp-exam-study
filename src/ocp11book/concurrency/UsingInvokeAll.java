package ocp11book.concurrency;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingInvokeAll {
    private static void invokeAllDemo() throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            Callable<String> task = () -> "result";
            List<Future<String>> results = service.invokeAll(List.of(task, task, task));
            // jvm waits here for all tasks to finish at the above line
            for (Future<String> result : results) {
                System.out.println(result.get());
            }
            System.out.println("end");
        } finally {
            if (service != null) service.shutdown();
        }
    }

    private static void invokeAnyDemo() throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            Callable<String> task = () -> "result";
            String result = service.invokeAny(List.of(task, task, task));
            // jvm waits for any of the tasks to finish at this point. Unfinished tasks are cancelled
            System.out.println(result);
            System.out.println("end");
        } finally {
            if (service != null) service.shutdown();
        }
    }

    public static void main(String[] args) throws Exception{
        invokeAllDemo();
        System.out.println("------------");
        invokeAnyDemo();
    }
}
