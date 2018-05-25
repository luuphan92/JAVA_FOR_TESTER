package com.tvn.session.random;

/**
 * Created by user on 5/11/17 21:02.
 */
public class MathRandom0ToN {
    public static void main(String[] args) {
        //random an int from 0 to n
        int number = (int) (Math.random() * 10);
        System.out.println("number = " + number);
    }
}
