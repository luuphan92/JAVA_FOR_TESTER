package com.tvn.session.two.decisionmaking;

/**
 * Created by Luu Phan on 01/07/2017.
 */
public class EX07_0 {
    public static int findMaxValue(int a, int b) {
        int findMaxValue = (a > b) ? a : b;

        return findMaxValue;
    }

    public static void main(String[] args) {
        System.out.println("Max value of 3 and 4 is: " + findMaxValue(3, 4));
        System.out.println("Max value of 5 and 6 is: " + findMaxValue(5, 6));
        System.out.println("Max value of -1 and -3 is: " + findMaxValue(-1, -3));

    }
}
