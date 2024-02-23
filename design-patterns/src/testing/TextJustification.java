package testing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TextJustification {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treemap = new TreeMap<>();
        Map<Integer, Integer> linkMap = new LinkedHashMap<>();

        System.out.println('b' - 'a');

//        String s = addDayInDate("28/02/2023");
//        System.out.println(s);


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