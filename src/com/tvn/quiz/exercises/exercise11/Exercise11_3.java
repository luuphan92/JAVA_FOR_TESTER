package com.tvn.quiz.exercises.exercise11;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by user on 3/9/17 3:04 AM.
 */
public class Exercise11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your strLength: ");
        int len = sc.nextInt();
        System.out.print("Chars to use for random string generation: ");
        String characters = sc.next();

        generateString(len,characters);
    }

    public static void generateString(int strLength, String chars) {
        Random generate = new Random();
        int charLen = chars.length();
        StringBuilder rString = new StringBuilder();

        for (int i = 0; i < strLength; i++){
            char rChar = chars.charAt(generate.nextInt(charLen));
            rString.append(rChar);
        }
        System.out.println("Your string is: " + rString);
    }
}
