package com.tvn.quiz.exercises.exercise09;

import java.util.Arrays;

/**
 * Created by user on 2/22/17 9:13 PM.
 */
public class Exercise09_2 {
    public static void main(String[] args) {
        int[] aryNums = { 184, 117, 81, 157, 209, 40, 58, 77, 90, -1 };
        int oddNum = 0;

        for (int i = 0; i < aryNums.length; i++) {
            oddNum = aryNums[i] % 2;
            if (oddNum == 1) {
                System.out.println("odd number = " + aryNums[i]);
            }
        }
    }
}
