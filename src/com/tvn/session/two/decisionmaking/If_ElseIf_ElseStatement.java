package com.tvn.session.two.decisionmaking;

/**
 * Created by user on 2/24/17 9:01 PM.
 */
public class If_ElseIf_ElseStatement {

    private static void printIfElseIfStatement(int x) {
        if (x < 10) {
            System.out.println("Value of x is less than 10");
        }
        else if (x < 20) {
            System.out.println("Value of x is is between (10,20)");
        }
        else if (x < 30) {
            System.out.println("Value of x is between (20,30)");
        }
        else {
            System.out.print("Can't not detect value x");
        }
    }

    public static void main(String args[]) {
        printIfElseIfStatement(10);
    }
}