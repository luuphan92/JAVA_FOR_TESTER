package com.tvn.session.five.date_and_time;

/**
 * Created by user on 5/20/17 06:51.
 */
public class SystemCurrentTimeMillisTask {
    public static void main(String[] args) {

        //calculate the time that the task takes
        long startTime = System.currentTimeMillis();
        for(int x = 0; x < 1000; x++){
            System.out.println("Number " + (x + 1));
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Total Time " + (endTime - startTime) + "ms");
    }
}
