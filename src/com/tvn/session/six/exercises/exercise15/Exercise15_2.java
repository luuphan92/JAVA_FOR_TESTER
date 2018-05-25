package com.tvn.session.six.exercises.exercise15;

/**
 * Created by user on 3/23/17 02:25.
 */
public class Exercise15_2 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("number format exception occurred");
        }
    }
}
