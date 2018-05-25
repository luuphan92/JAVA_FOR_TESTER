package com.tvn.quiz.exercises.exercise09;

/**
 * Created by user on 5/11/17 22:20.
 */
public class Exercise09_0 {
    public static void nestedLoop() {
        for (int count1 = 1; count1 <= 5; count1++) {
            for (int count2 = 1; count2 <= 5; count2++) {
                System.out.print(count1 * count2 + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nestedLoop();
    }
}
