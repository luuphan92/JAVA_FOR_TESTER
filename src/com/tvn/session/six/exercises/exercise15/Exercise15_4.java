package com.tvn.session.six.exercises.exercise15;

/**
 * Created by user on 3/23/17 02:30.
 */
public class Exercise15_4 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
