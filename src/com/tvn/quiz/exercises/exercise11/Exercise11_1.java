package com.tvn.quiz.exercises.exercise11;

/**
 * Created by user on 3/9/17 12:45 AM.
 */
public class Exercise11_1 {
    public static void main(String[] args) {
        generate100Number();
    }

    private static void generate100Number() {
        int min = 15;
        int max = 20;
        for (int x = 0; x < 100; x ++) {
            int rangeNumber = (int) (Math.random() * ((max - min) + 1)) + min;
            System.out.println("rangeNumber [" + (x + 1) + "] = " + rangeNumber);

            if((rangeNumber < min) || (rangeNumber > max)) {
                System.out.println("---> There is something wrong");
            }
        }
    }
}
