package com.tvn.session.random;

import java.util.Random;

/**
 * Created by user on 7/7/17 23:25.
 */
public class JavaUtilRandomCharExplicitly {
    public static char randomChar() {
        //define the charsToUse
        String charstoUse = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //get the length of the string
        int strLength = charstoUse.length();

        //get an index number from 0 to (length - 1)
        Random generate = new Random();
        int index = generate.nextInt(strLength);

        //return the char at index above
        return charstoUse.charAt(index);
    }

    public static void main(String[] args) {
        System.out.println("rChar: " + randomChar());
    }
}
