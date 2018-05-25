package com.tvn.session.five.date_and_time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 5/20/17 07:09.
 */
public class SimpleDateFormatWay2 {
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("y M d HH:mm:ss");
        String newDate1 = sdf1.format(date);
        System.out.println("newDate1 = " + newDate1);
    }
}
