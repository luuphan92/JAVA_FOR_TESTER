package com.tvn.session.loop_control;

/**
 * Created by Luu Phan on 08/07/2017.
 */
public class Ex09_1 {
    public static void calculateAverage() {
        int[] numbers = new int[] {13, 20, 7, 25, 2, 14, 9, 100, 11};
        int sum = 0;
        
        for (int i = 0; i < numbers.length;i++) {
            sum = sum + numbers[i];//0  + 13 + 20 + 7 .... + 100
        }
        double average = (double) sum / numbers.length;
        System.out.println("average = " + average);
        
    }

    public static void main(String[] args) {
        calculateAverage();
    }
}