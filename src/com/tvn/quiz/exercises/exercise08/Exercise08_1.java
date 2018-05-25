package com.tvn.quiz.exercises.exercise08;

import java.util.Arrays;

/**
 * Created by user on 2/22/17 9:03 PM.
 */
public class Exercise08_1 {

    private static void findMinMax(int[] numArrays) {
        Arrays.sort(numArrays);

        System.out.println("Lowest number is : " + numArrays[0]);
        System.out.println("Highest number is : " + numArrays[numArrays.length-1]);
    }

    public static void main(String[] args) {
        int[] arrays = {146, 113, 9999, 172, 63, 62, 116};
        findMinMax(arrays);
    }
}
