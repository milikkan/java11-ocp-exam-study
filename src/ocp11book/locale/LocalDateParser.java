package ocp11book.locale;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateParser {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2020-04-30",
//                DateTimeFormatter.ISO_LOCAL_DATE_TIME); // throws exception at runtime, wrong formatter passed
                DateTimeFormatter.ISO_LOCAL_DATE); // 2020 APRIL 30
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
