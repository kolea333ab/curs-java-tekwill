package org.example.Days;

public class Main {
    public static void main (String [] args) {
        for (Weekday day : Weekday.values()) {

            System.out.println("Day " + day);
            System.out.println("Weekday? " + day.isWeekDay());
            System.out.println("Holiday? " + day.isHoliday());
            System.out.println();
        }
    }
}
