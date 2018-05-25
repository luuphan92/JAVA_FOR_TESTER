package com.tvn.session.one.operators;

/**
 * Created by Luu Phan on 01/07/2017.
 */
public class RelationalOperators {
    public static void main(String[] args) {
        int a = 120;
        int b = 20;

        boolean equalTo = a == b;
        System.out.println("a == b is " + equalTo);

        boolean notEqualTo = a != b;
        System.out.println("a != b is " + notEqualTo);

        boolean greaterThan = a > b;
        System.out.println("a > b is " + greaterThan);

        boolean lessThan = a < b;
        System.out.println("a < b is " + lessThan);

        boolean greterThanOrEqualTo = a >= b;
        System.out.println("a >= b is " + greterThanOrEqualTo);

        boolean lessThanOrQualTo = a <= b;
        System.out.println("a <= b is " + lessThanOrQualTo);

    }
}
