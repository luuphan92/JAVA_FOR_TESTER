package com.tvn.quiz.exercises.exercise11;

import java.util.Random;

/**
 * Created by user on 3/9/17 3:32 PM.
 */
public class Exercise11_5 {
    public static void main(String[] args) {
        String[] strArray = {"red", "blue", "orange", "purple", "black", "white", "pink", "yellow"};
        chooseRandom(strArray);
    }

    public static void chooseRandom(String[] strArray) {
        Random rand = new Random();
        String arrayItem = strArray[rand.nextInt(strArray.length)];
        System.out.println("Your item is: " + arrayItem);
    }
}
