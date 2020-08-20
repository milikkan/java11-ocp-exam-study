package ocp11book.concurrency.polling;

public class CheckResultsUsingSleep {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException { // for Thread.sleep()
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                CheckResultsUsingSleep.counter++;
            }
        }).start();

        while (CheckResultsUsingSleep.counter < 100) {
            System.out.println("Not reached yet");
            Thread.sleep(1000); // causes main thread to sleep for 1 second
        }
        System.out.println("Reached");
    }
}
