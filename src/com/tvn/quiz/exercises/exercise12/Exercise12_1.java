package com.tvn.quiz.exercises.exercise12;

/**
 * Created by user on 3/9/17 4:38 PM.
 */
public class Exercise12_1 {
    public static void pause(long time) {
        System.out.println("Pause " + time + "ms");
        long curretMillis = System.currentTimeMillis();
        long timeAfterPause = curretMillis + time;
        while (System.currentTimeMillis() < timeAfterPause){
        }
        System.out.println("Current millis after pausing: " + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        System.out.println("Current millis is: " + System.currentTimeMillis());
        pause(10000);
        System.out.println("Start next code..");
    }
}
