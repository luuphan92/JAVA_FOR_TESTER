package com.tvn.session.two.decisionmaking;

/**
 * Created by user on 2/24/17 8:59 PM.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        // number is assigned value 1
        int number = true ? 1 : 2;
        System.out.println("number: " + number);

        // string is assigned value "Sorry, it's false"
        String string = false ? "Hey, it was true" : "Sorry, it's false";
        System.out.println("string: " + string);
    }
}
