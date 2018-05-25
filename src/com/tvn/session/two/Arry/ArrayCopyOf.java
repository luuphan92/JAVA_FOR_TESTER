package com.tvn.session.two.Arry;

import java.util.Arrays;

/**
 * Created by user on 5/5/17 17:37.
 */
public class ArrayCopyOf {
    public static void main(String[] args) {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        //method copyOf
        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 7);
        System.out.println("weekDays[0]: " + weekDays[0]);
        System.out.println("weekDays[1]: " + weekDays[1]);


        System.out.println("weekDays[5]: " + weekDays[5]); //should return null as default value
        System.out.println("weekDays[6]: " + weekDays[6]); //should return null as default value
    }
}
