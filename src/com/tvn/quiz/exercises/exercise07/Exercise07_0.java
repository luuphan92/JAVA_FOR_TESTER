package com.tvn.quiz.exercises.exercise07;

/**
 * Created by user on 5/5/17 17:14.
 */
public class Exercise07_0 {

    public static int findMaxValue(int a, int b) {
        //find max value use Ternary Operator
        int maxVal = a > b ? a : b;
        return maxVal;
    }

    public static void main(String[] args) {
        System.out.println("Max value of 3 and 4 is: " + findMaxValue(3,4));
        System.out.println("Max value of 6 and 5 is: " + findMaxValue(6,5));
        System.out.println("Max value of -1 and -2 is: " + findMaxValue(-1,-2));
    }
}
