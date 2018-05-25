package com.tvn.quiz.exercises.exercise16;

/**
 * Created by user on 3/23/17 15:44.
 */
public class Exercise16_1 {
    public static void main(String[] args) {
        System.out.println("Sum of first 10 interger numbers: " + sumNIntergers(10));
    }

    public static int sumNIntergers(int number){
        int sum = 0;
        for(int i = 1; i <= number; i ++){
            sum += i;
        }
        return sum;
    }
}
