package com.tvn.session.five.date_and_time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 5/20/17 07:11.
 */
public class SimpleDateFormatWay3 {
    public static void main(String[] args) {

        Date date = new Date();
        String newDate2 = new SimpleDateFormat("MMMM dd, yyyy - hh:mma").format(date);
        System.out.println("newDate2 = " + newDate2);
    }
}
