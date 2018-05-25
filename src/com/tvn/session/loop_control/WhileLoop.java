package com.tvn.session.loop_control;

/**
 * Created by user on 5/11/17 20:33.
 */
public class WhileLoop {

    public static void printWhileLoop(int a) {
        while( a < 10 ) {
            System.out.println("value of a : " + a );
            a++;
        }
    }

    public static void main(String[] args) {
        printWhileLoop(5);
    }
}
