package com.tvn.session.loop_control;

/**
 * Created by user on 5/10/17 21:45.
 */
public class ForLoopWithArray1 {
    public static void main(String[] args) {

        String[] workDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        for (int i = 0; i < workDays.length; i++) {
            System.out.println(workDays[i]);
        }
    }
}
