package com.tvn.session.loop_control;

/**
 * Created by user on 5/11/17 20:39.
 */
public class PassingArraysToMethod {
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] odd = {1, 3, 5, 7, 9};
        printArray(odd);

        System.out.println();

        printArray(new int[] {0, 2, 4, 6, 8});
    }
}
