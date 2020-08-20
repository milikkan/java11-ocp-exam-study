package singleton;

import java.util.HashSet;
import java.util.Set;

public class Show {
    // eager initialization
    // private static final Show INSTANCE = new Show();

    // lazy initialization, omit final modifier
    private static Show INSTANCE;

    private Set<String> availableSeats;

    // eager initialization
//    public static Show getInstance() {
//        return INSTANCE;
//    }

    // lazy initialization, initialize Singleton on the first use
    public static Show getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Show();
        }
        return INSTANCE;
    }

    // private constructor
    private Show() {
        availableSeats = new HashSet<>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
    private static void ticketAgentBooks(String seat) {
        Show show = getInstance();
        System.out.println(show.bookSeat(seat));
    }

    public static void main(String[] args) {
        ticketAgentBooks("1A");
        ticketAgentBooks("1B");
        ticketAgentBooks("1B");
    }
}
