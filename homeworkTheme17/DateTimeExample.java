package homeworkTheme17;

import java.time.*;

public class DateTimeExample {
    public static void main(String[] args) {
        // 1. LocalDate — 2 января 2024
        LocalDate date = LocalDate.of(2024, 1, 2);
        System.out.println("LocalDate: " + date);

        // 2. LocalTime — 13:20
        LocalTime time = LocalTime.of(13, 20);
        System.out.println("LocalTime: " + time);

        // 3. LocalDateTime — 2 января 2024, 13:20
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("LocalDateTime: " + dateTime);

        // 4. ZonedDateTime — 2 января 2024, 13:20, America/New_York
        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.of("America/New_York"));
        System.out.println("ZonedDateTime: " + zonedDateTime);

        // 5. Добавление 1 минуты, 1 часа, 1 дня, 1 года
        ZonedDateTime plusTime = zonedDateTime
                .plusMinutes(1)
                .plusHours(1)
                .plusDays(1)
                .plusYears(1);
        System.out.println("ZonedDateTime +1m +1h +1d +1y: " + plusTime);
    }
}
