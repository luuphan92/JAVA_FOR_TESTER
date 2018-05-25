package com.tvn.session.five.date_and_time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 3/18/17 10:20.
 */
public class DateTimeFormatSample {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE,MMM dd,yyyy");
        System.out.println("Format 1: " + sdf1.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        System.out.println("Format 2: " + sdf2.format(date));

        SimpleDateFormat sdf3 = new SimpleDateFormat("hha - MMb/dd/yyyy");
        System.out.println("Format 3: " + sdf3.format(date));
    }
}
