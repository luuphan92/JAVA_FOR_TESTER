package com.tvn.quiz.exercises.exercise11;

import java.util.Random;

/**
 * Created by user on 3/9/17 2:09 AM.
 */
public class Exercise11_2 {
    public static void main(String[] args) {
        generate100Number();
    }

    private static void generate100Number() {
        Random generate = new Random();
        int min = 15;
        int max = 20;
        for (int x = 0; x < 1000; x ++) {
            int rangeNumber = generate.nextInt(max - min + 1) + min;
            System.out.println("rangeNumber [" + (x + 1) + "] = " + rangeNumber);

            if((rangeNumber < 15) || (rangeNumber > 20)) {
                System.out.println("---> There is something wrong");
            }
        }
    }
}
