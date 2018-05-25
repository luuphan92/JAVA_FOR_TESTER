package com.tvn.exercises.ExcercisesLoop;

public class Average {
    public static void calculateAverage1() {
        int[] number = {13, 20, 7, 25, 2, 14, 9, 100};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        double average = (double) sum / (double) number.length;
        System.out.println("Avarage value of the array elements is: " + average);
    }

    public static void main(String[] args) {
        calculateAverage1();
    }
}
