package com.tvn.exercises.ExcercisesLoop;

public class OddNumber {
    public static void checkOdd() {
        int[] number = {184, 117, 81, 157, 209, 40, 58};
        for (int i = 0;i < number.length; i++) {
            if (number[i]%2 != 0){
                System.out.println(" odd number = " + number[i]);
            }
        }
    }
    public static void main(String[] args) {
        checkOdd();
    }



}
