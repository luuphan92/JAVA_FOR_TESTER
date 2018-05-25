package com.tvn.session.loop_control;

/**
 * Created by user on 5/11/17 20:33.
 */
public class DoWhileLoop {

    public static void printDoWhileLoop(int m) {
        do {
            System.out.println("value of m : " + m);
            m++;
        } while (m < 10);
    }

    public static void main(String[] args) {
        printDoWhileLoop(5);
    }
}
