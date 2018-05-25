package com.tvn.session.random;

/**
 * Created by user on 5/11/17 21:09.
 */
public class MathRandomMinToMax {

    public static void main(String[] args) {
        int min = 3;
        int max = 10;
        int randomRange = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println("randomRange = " + randomRange);
    }
}

