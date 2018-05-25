package com.tvn.session.random;

import java.util.Random;

/**
 * Created by Luu Phan on 08/07/2017.
 */
public class Ex011_2 {
    public static void verifyRandom() {
        Random generate = new Random();
        int min = 15;
        int max = 20;

        for (int i = 0; i < 1000; i++) {
            int number = generate.nextInt(max - min + 1) + min;
            if (number < 15 || number > 20) {
                System.out.println("There is something wrong here");
            } else {
                System.out.println("number: " + number);
            }
        }
    }

    public static void main(String[] args) {
        verifyRandom();
    }
}
