package com.tvn.session.six.Debug;

public class Excercise16_2 {
    public static void main(String[] args) {
        System.out.println("makeChocolate(5,1,9) --> 4. Run: " + makeChocolate(5, 1, 9));
        System.out.println("makeChocolate(3,1,9) --> -1. Run: " + makeChocolate(3, 1, 9));
        System.out.println("makeChocolate(4,1,7) --> 2. Run: " + makeChocolate(4, 1, 7));
        System.out.println("makeChocolate(1,2,6) --> 1. Run: " + makeChocolate(1, 2, 6));
        System.out.println("makeChocolate(1,2,5) --> 0. Run: " + makeChocolate(1, 2, 5));
        System.out.println("makeChocolate(4,1,9) --> 4. Run: " + makeChocolate(4, 1, 9));

    }

    public static int makeChocolate(int small, int big, int goal) {
        int bigUse = goal / 5;
        int goalRemain = goal % 5;
        int smallUse = 0;

        if (big >= bigUse) {
            if (goal >= goalRemain) {
                smallUse = goalRemain;
            } else {
                smallUse = -1;
            }
        } else {
            if (small > goalRemain) {
                smallUse = goalRemain;
            } else { smallUse = -1;}
        }
        return smallUse;

    }
}