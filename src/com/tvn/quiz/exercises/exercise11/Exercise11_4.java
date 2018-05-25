package com.tvn.quiz.exercises.exercise11;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by user on 3/9/17 3:16 AM.
 */
public class Exercise11_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your strLength: ");
        int len = sc.nextInt();


//        System.out.print("Chars to use for random string generation: ");
//        String inputChars = sc.next();

//        System.out.println(inputChars);
//
//        if (inputChars.isEmpty()) {
//            inputChars = "";
//            System.out.println("Read Enter Key!");
//        }

        sc.nextLine();

        System.out.print("Chars to use for random string generation: ");
        String inputChars = sc.nextLine();

        if (inputChars.isEmpty()) {
            inputChars = "";
            System.out.println("Use default charSet a-z, A-Z and 0-9 to random String");
        }

        generateString(len,inputChars);
    }

    public static void generateString(int strLength, String chars) {
        Random generate = new Random();
        String charsList = chars.isEmpty() ? "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890" : chars;
        StringBuilder rString = new StringBuilder();

        for (int i = 0; i < strLength; i++){
            char rChar = charsList.charAt(generate.nextInt(charsList.length()));
            rString.append(rChar);
        }
        System.out.println("Your string is: " + rString);
    }
}
