package ocp11book.concurrency;

public class UsingRunnable {
    public static void main(String[] args) {
        // following Runnable implementations compile
        Runnable sloth = () -> System.out.println("Hello world");
        Runnable snake = () -> {int i = 10; i++;};
        Runnable beaver = () -> {return;};
        Runnable coyote = () -> {};

        // following lines don't compile because ru method cannot return a value
//        Runnable capybara = () -> "";
//        Runnable hippopotamus = () -> 5;
//        Runnable emu = {return new Object();};
    }
}
