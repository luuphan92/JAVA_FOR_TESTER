package com.tvn.session.one.operators;

/**
 * Created by Luu Phan on 01/07/2017.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean and = a && b;
        System.out.println("a and b is " + and);

        boolean or = a || b;
        System.out.println("a or b is " + or);

        boolean not = !(a && b);
        System.out.println("not (a and b) is " + not);

    }
}
