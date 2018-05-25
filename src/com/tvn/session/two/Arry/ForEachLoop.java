package com.tvn.session.two.Arry;

import java.util.Arrays;

/**
 * Created by user on 2/21/17 9:40 PM.
 */
public class ForEachLoop {
    private static void printAllWorkDays() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        //example for reach
        for (String workday: workdays) {
            System.out.println(workday);
        }
    }

    public static void main(String[] args) {
        printAllWorkDays();
    }
}
