package com.tvn.session.six.checked_exceptions;

/**
 * Created by user on 3/22/17 23:34.
 */
public class CheckedExceptionExample3 {
    public static void main(String[] args) {
        int a = addTwoNumber(5,6);
        System.out.println("a = " + a);
    }

    public static int addTwoNumber(int a, int b) {
        return a + b;
    }
}
