package com.tvn.session.two.decisionmaking;

/**
 * Created by user on 2/24/17 8:57 PM.
 */
public class IfStatement {

    public static void printIfStatement(int x) {
        if (x < 20) {
            System.out.println("This is if statement");
        }
    }

    public static void main(String[] args) {
        printIfStatement(30);
        printIfStatement(5);
    }
}
