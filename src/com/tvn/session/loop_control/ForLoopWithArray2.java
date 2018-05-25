package com.tvn.session.loop_control;

/**
 * Created by user on 5/11/17 20:32.
 */
public class ForLoopWithArray2 {
    public static void main(String[] args) {
        String[] weekendDays = {"Friday","Saturday","Sunday"};
        String weekend = "";

        for (int j = 0; j < weekendDays.length; j++) {
            weekend = weekend + "|" + weekendDays[j];
        }

        System.out.println("weekend: " + weekend);
    }
}
