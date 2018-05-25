package com.tvn.session.two.Arry;

/**
 * Created by user on 2/23/17 1:36 PM.
 */
public class MethodWithArray {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] odd = {1, 3, 5, 7, 9};
        printArray(odd);

        System.out.println("");

        printArray(new int[] {0, 2, 4, 6, 8});

        System.out.println("");
        int[] array1 = {1,2,3,4,5,6,7,8};
        printArray(array1);


    }
}
