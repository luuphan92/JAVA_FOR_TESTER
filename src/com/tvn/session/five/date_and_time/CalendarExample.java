package com.tvn.session.five.date_and_time;

import java.util.Calendar;

/**
 * Created by user on 3/9/17 22:49.
 */
public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Date: " + calendar.getTime());
        System.out.println("Current Millis: " + calendar.getTime().getTime());
        System.out.println("Calendar.YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("Calendar.MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("Calendar.DATE: " + calendar.get(Calendar.DATE));
        System.out.println("Last day of this month: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("Calendar.DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Calendar.DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Calendar.WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
    }
}
