package com.tvn.session.random;

import java.util.Random;

/**
 * Created by user on 5/11/17 21:15.
 */
public class JavaUtilRandomNextInt {
    public static void main(String[] args) {
        Random generate = new Random();

        //nextInt(int below)
        int ran1 = generate.nextInt(5);
        System.out.println("ran1 = " + ran1);

        int ran2 = generate.nextInt(200);
        System.out.println("ran2 = " + ran2);
    }
}
