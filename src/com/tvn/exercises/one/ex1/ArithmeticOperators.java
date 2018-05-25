package com.tvn.exercises.one.ex1;

/**
 * Created by Luu Phan on 24/06/2017.
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int addition = a + b;
        System.out.println("a + b =" + addition);

        int subtraction = a - b;
        System.out.println("a - b = " + subtraction);

        int multiplication = a * b;
        System.out.println("a * b = " + multiplication);

        double divison = (double)a / (double)b;
        System.out.println("a /b = " + divison);

        int modulus = a % b;
        System.out.println("a % b = " + modulus);

        int increament = ++a;
        System.out.println("++a = " + increament);

        int decrement = --b;
        System.out.println("--b = " + decrement);

    }
}
