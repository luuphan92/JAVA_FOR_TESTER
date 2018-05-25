package com.tvn.session.random;

import java.util.Random;

/**
 * Created by user on 5/11/17 21:22.
 */
public class JavaUtilRandomChar {

    public static char randomChar() {
        Random generate = new Random();

        String charsToUse = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        return charsToUse.charAt(generate.nextInt(charsToUse.length()));
    }

    public static void main(String[] args) {
        System.out.println("rChar: " + randomChar());
    }
}
