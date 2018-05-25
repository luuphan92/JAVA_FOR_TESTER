package com.tvn.quiz.exercises.exercise09;

import java.util.Scanner;

/**
 * Created by user on 5/10/17 22:45.
 */
public class Exercise09_5 {
    static Scanner sc = new Scanner(System.in);

    public static void findMinMax(int number){

        System.out.print("Enter a value: ");
        int value = sc.nextInt();
        int min, max;
        min = max = value;

        for (int i = 2; i <= number; i++) {
            if (i != number) {
                System.out.print("Enter value " + i + ": ");
            } else {
                System.out.print("Enter last value: ");
            }

            value = sc.nextInt();
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Lowest: " + min);
        System.out.println("Highest: " + max);
    }

    public static void main(String[] args) {
        System.out.print("How many numbers will you input? ");
        int number = sc.nextInt();
        findMinMax(number);
    }
}
