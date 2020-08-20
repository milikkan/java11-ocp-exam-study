package ocp11book.locale;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DTFormatter {

    public static void main(String[] args) {
//        var f = DateTimeFormatter.ofPattern("hh o'clock"); // compiles but throws runtime exception

        var f = DateTimeFormatter.ofPattern("hh 'o''clock'"); // correct the formatting
        // escape any regular text, escape single quote using an additional single quote before it
        System.out.println(f.format(LocalTime.now()));
        System.out.println(f.format(LocalDateTime.now()));
        System.out.println(f.format(ZonedDateTime.now()));
//        System.out.println(f.format(LocalDate.now())); // compiles but throws exception at runtime
    }
}
