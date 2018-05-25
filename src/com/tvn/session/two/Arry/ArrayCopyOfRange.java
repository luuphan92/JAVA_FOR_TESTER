package com.tvn.session.two.Arry;

import java.util.Arrays;

/**
 * Created by user on 5/5/17 17:38.
 */
public class ArrayCopyOfRange {
    public static void main(String[] args) {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        //method copyOfRange
        String[] weekDaysRange = Arrays.copyOfRange(workdays,2,5);
        System.out.println("weekDaysRange[0]: " + weekDaysRange[0]);
        System.out.println("weekDaysRange[1]: " + weekDaysRange[1]);
        System.out.println("weekDaysRange[2]: " + weekDaysRange[2]);

        String[] weekDaysRange2 = Arrays.copyOfRange(workdays,2,7);
        System.out.println("weekDaysRange2[0]: " + weekDaysRange2[0]);
        System.out.println("weekDaysRange2[1]: " + weekDaysRange2[1]);
        System.out.println("weekDaysRange2[2]: " + weekDaysRange2[2]);
        System.out.println("weekDaysRange2[3]: " + weekDaysRange2[3]);
        System.out.println("weekDaysRange2[4]: " + weekDaysRange2[4]);
    }
}
