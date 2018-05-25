package com.tvn.session.loop_control;

/**
 * Created by user on 5/11/17 22:15.
 */
public class NestedLoop {
    public static void printRectangle(int height, int width) {
        for (int count1 = 1; count1 <= height; count1++) {
            for (int count2 = 1; count2 <= width; count2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printRectangle(7,5);
    }
}
