package com.tvn.quiz.exercises.exercise09;

/**
 * Created by user on 2/22/17 8:48 PM.
 */
public class Exercise09_1 {

    public static void calculateAverage() {
        int[] numbers = new int[] {13, 20, 7, 25, 2, 14, 9, 100};

        //calculate sum of all array elements
        int sum = 0;
        for(int i = 0; i < numbers.length ; i++) {
            sum = sum + numbers[i];
        }

        //calculate average value
        double average = (double) sum / (double) numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }

    public static void main(String[] args) {
        calculateAverage();
    }
}
