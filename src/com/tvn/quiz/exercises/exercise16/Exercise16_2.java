package com.tvn.quiz.exercises.exercise16;

/**
 * Created by user on 3/24/17 00:10.
 */
public class Exercise16_2 {
    public static void main(String[] args) {
        System.out.println("makeChocolate(5,1,9) --> 4. Run: " + makeChocolate(5,1,9));
        System.out.println("makeChocolate(3,1,9) --> -1. Run: " + makeChocolate(3,1,9));
        System.out.println("makeChocolate(4,1,9) --> 4. Run: " + makeChocolate(4,1,9));
        System.out.println("makeChocolate(4,1,10) --> -1. Run: " + makeChocolate(4,1,10));
        System.out.println("makeChocolate(5,1,10) --> 5. Run: " + makeChocolate(5,1,10));
        System.out.println("makeChocolate(6,1,10) --> 5. Run: " + makeChocolate(6,10,10));
    }

    public static int makeChocolate(int small, int big, int goal) {
        int bigUse = goal / 5;
        int goalRemain = goal % 5;
        int smallUse = 0;

        if (big >= bigUse) {
            if (small > goalRemain) {
                smallUse = goalRemain;
            } else {
                smallUse = -1;
            }
        }else {
            if (small > goalRemain) {
                smallUse = goalRemain;
            }
            else {
                smallUse = -1;
            }
        }
        return smallUse;
    }
}
