package com.tvn.quiz.exercises.exercise12;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 5/17/17 23:24.
 */
public class Exercise12_2 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();

        sdf.applyPattern("HH:mm:ss");
        String formatDate1 = sdf.format(date);
        System.out.println("formatDate1 = " + formatDate1);

        sdf.applyPattern("MM/dd/yy h:mm a");
        String formatDate2 = sdf.format(date);
        System.out.println("formatDate2 = " + formatDate2);

        sdf.applyPattern("E MMM dd HH:mm:ss z yyyy");
        String formatDate3 = sdf.format(date);
        System.out.println("formatDate3 = " + formatDate3);

        sdf.applyPattern("MMMM dd, yyyy hh:mm:ss a");
        String formatDate4 = sdf.format(date);
        System.out.println("formatDate4 = " + formatDate4);

        sdf.applyPattern("dd-MM-yyyy HH:mm:ss");
        String formatDate5 = sdf.format(date);
        System.out.println("formatDate5 = " + formatDate5);

        sdf.applyPattern("EEE, MMM dd, yyyy");
        String formatDate6 = sdf.format(date);
        System.out.println("formatDate6 = " + formatDate6);
    }
}
