package ocp11book.concurrency;

public class CreatingThreads {
    // first method: implementing java.lang.Runnable
    static class PrintData implements Runnable {
        @Override public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing record: " + i);
            }
        }
    }

    // second method: extending java.lang.Thread (less common)
    static class ReadInventory extends Thread {
        @Override public void run() {
            System.out.println("Printing zoo inventory...");
        }
    }

    private static void runThreads() {
        // output of this code is unpredictable as the threads run asynchronously
        System.out.println("BEGIN");
        (new ReadInventory()).start(); // start() method is needed to start the thread running
        (new Thread(new PrintData())).start();
        (new ReadInventory()).start();
        System.out.println("END");
    }
    private static void runInsteadOfStart() {
        // when run() is used instead of start()
        // -- each thread waits for the previous oıne to finish
        // -- output will always be same
        System.out.println("BEGIN");
        (new ReadInventory()).run(); // start() method is needed to start the thread running
        (new Thread(new PrintData())).run();
        (new ReadInventory()).run();
        System.out.println("END");
    }
    public static void main(String[] args) {
        runThreads();
        //runInsteadOfStart();
    }
}
