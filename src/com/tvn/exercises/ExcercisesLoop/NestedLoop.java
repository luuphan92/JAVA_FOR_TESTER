package com.tvn.exercises.ExcercisesLoop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++ ) {
            for (int column = 1; column <= 5; column++) {
                System.out.print( row * column + "\t");
            }
            System.out.println("");

        }
    }
}
