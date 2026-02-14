package testing;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class TextJustification {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.parse("19/03/24");

        LocalDate lastDate = LocalDate.parse("19/04/24");

        DayOfWeek dayOfWeek = lastDate.getDayOfWeek();
        System.out.println(dayOfWeek);

    }

    public static String addDayInDate(String date) {
        String[] split = date.split("/");
        int day = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int year = Integer.parseInt(split[2]);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            daysInMonth[1] = 29;
        }

        if (day == daysInMonth[month - 1]) {
            day = 1;
            month++;

            // Check if it's the last month of the year
            if (month > 12) {
                month = 1;
                year++;
            }
        } else {
            day++;
        }

        return day + "/" + month + "/" + year;
    }



}