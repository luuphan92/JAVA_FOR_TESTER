package com.tvn.session.five.date_and_time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 5/20/17 07:08.
 */
public class SimpleDateFormatWay1 {
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("MM/dd/yyy");
        String newDate = sdf.format(date);
        System.out.println("newDate = " + newDate);

    }
}
