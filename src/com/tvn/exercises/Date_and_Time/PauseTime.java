package com.tvn.exercises.Date_and_Time;

public class PauseTime {
    public static void pauseTime(long pauseTime) {
        System.out.println("before");
        long startTime = System.currentTimeMillis();
        long endTime = startTime + pauseTime;
        while (System.currentTimeMillis() < endTime) {
//            System.out.println("*");
        }
        System.out.println("after");
        System.out.println("Time: " + (endTime - startTime));

    }

    public static void main(String[] args) {
        pauseTime(5000);
    }
}
