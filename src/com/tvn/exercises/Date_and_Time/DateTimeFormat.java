package com.tvn.exercises.Date_and_Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormat {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("MM/dd/yy");
        String newDate = sdf.format(date);
        System.out.println("newdate: " + newDate);
    }
}
