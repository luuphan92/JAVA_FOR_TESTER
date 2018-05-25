package com.tvn.session.five.date_and_time;

import java.util.Date;

/**
 * Created by user on 5/20/17 07:04.
 */
public class DateMethods {
    public static void main(String[] args) {

        Date today = new Date();
        System.out.println(today.toString());

        long currentMillis = today.getTime();
        System.out.println("getTime: " + currentMillis);

        Date sameDay = new Date();
        sameDay.setTime(currentMillis);
        System.out.println("today.equals(sameDate): " + today.equals(sameDay));
        System.out.println("today.compareTo(sameDay): " + today.compareTo(sameDay));

        long last24hours = currentMillis - (1000 * 60 * 60 * 24);
        Date yesterday = new Date();
        yesterday.setTime(last24hours);
        System.out.println("yesterday : " + yesterday);

        System.out.println("today.after(yesterday): " + today.after(yesterday));
        System.out.println("today.before(yesterday): " + today.before(yesterday));
    }
}
