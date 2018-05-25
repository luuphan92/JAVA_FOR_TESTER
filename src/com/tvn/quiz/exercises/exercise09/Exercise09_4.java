package com.tvn.quiz.exercises.exercise09;

import java.util.Scanner;

/**
 * Created by user on 5/10/17 22:19.
 */
public class Exercise09_4 {

    public static void printTriangle(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input length of the triangle: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printTriangle();
    }
}
