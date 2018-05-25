package com.tvn.exercises.ExcercisesLoop;

public class ReverseTriangle {
    public static void main(String[] args) {
        for (int c = 5; c >=1 ; c-- ) {
            for (int l = 1; l <= c; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
