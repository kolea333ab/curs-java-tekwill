package homeworkTheme17;

import java.time.*;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024, 1, 2);
        System.out.println("LocalDate: " + date);


        LocalTime time = LocalTime.of(13, 20);
        System.out.println("LocalTime: " + time);


        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("LocalDateTime: " + dateTime);


        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("America/New_York"));
        System.out.println("ZonedDateTime: " + zonedDateTime);


        ZonedDateTime modified = zonedDateTime
                .plusMinutes(1)
                .plusHours(1)
                .plusDays(1)
                .plusYears(1);

        System.out.println("Modified ZonedDateTime: " + modified);
    }
}