package ocp11book.concurrency.safety;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UsingLocks {
    public static void printMessage(Lock lock) {
        try {
            lock.lock();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) throws Exception {
        Lock lock = new ReentrantLock();

        new Thread(() -> printMessage(lock)).start();

        if (lock.tryLock(10, TimeUnit.SECONDS)) {
            try {

                System.out.println("Lock obtained, entering protected code.");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }
}
