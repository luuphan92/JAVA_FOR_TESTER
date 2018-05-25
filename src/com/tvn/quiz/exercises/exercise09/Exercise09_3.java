package com.tvn.quiz.exercises.exercise09;

import java.util.Scanner;

/**
 * Created by user on 2/23/17 3:04 PM.
 */
public class Exercise09_3 {

    public static void printTriangle(int x){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input length of the triangle: ");
        int number = sc.nextInt();

        printTriangle(number);
    }
}
