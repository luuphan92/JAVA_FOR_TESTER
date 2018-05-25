package com.tvn.session.two.decisionmaking;

/**
 * Created by user on 5/5/17 17:18.
 */
public class TernaryOperator2 {

    public static void printAbsoluteValue(int a){
        // absolute value example
        int absValue = (a < 0) ? -a : a;
        System.out.println("absolute = " + absValue);
    }

    public static void main(String[] args) {
        printAbsoluteValue(10);
        printAbsoluteValue(-10);
    }
}
