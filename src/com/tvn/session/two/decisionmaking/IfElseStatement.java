package com.tvn.session.two.decisionmaking;

/**
 * Created by user on 2/24/17 8:58 PM.
 */
public class IfElseStatement {

    public static void printIfElseStatement(int x) {
        if (x < 20) {
            System.out.println("This is if statement");
        }else {
            System.out.println("This is else statement");
        }
    }

    public static void main(String[] args) {
        printIfElseStatement(30);
        printIfElseStatement(10);

    }
}
