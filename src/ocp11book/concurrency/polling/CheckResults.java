package ocp11book.concurrency.polling;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                CheckResults.counter++;
            }
        }).start();

        while (CheckResults.counter < 100) {
            System.out.println("Not reached yet");
        }

        System.out.println("Reached");
    }
}
