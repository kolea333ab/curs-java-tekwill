package org.example.Months;

public class MonthsList {
    public static void main (String [] args) {
        String [] months = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль",
                "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        System.out.println("Месяцы года");
        for (String month : months) {
            System.out.println(month);
        }
    }

}
