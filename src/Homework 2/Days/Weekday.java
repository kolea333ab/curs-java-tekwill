package org.example.Days;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay () {
        return this == MONDAY || this == TUESDAY || this == WEDNESDAY || this == THURSDAY ||
                this == FRIDAY;
    }
    public boolean isHoliday () {
        return this == SATURDAY || this == SUNDAY;
    }
}
