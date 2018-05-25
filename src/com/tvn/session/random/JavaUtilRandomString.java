package com.tvn.session.random;

import java.util.Random;

/**
 * Created by user on 3/9/17 2:47 AM.
 */
public class JavaUtilRandomString {

    public static void generateString(int strLength) {
        Random generate = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder rString = new StringBuilder();

        for (int i = 0; i < strLength; i++){
            char rChar = characters.charAt(generate.nextInt(characters.length()));
            rString.append(rChar);
        }
        System.out.println("rString = " + rString);
    }

    public static void main(String[] args) {
        generateString(10);
        generateString(10);
    }
}
