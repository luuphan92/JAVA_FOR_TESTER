package com.tvn.session.two.Arry;

import java.util.Arrays;

/**
 * Created by user on 5/5/17 17:39.
 */
public class ArraySort {
    public static void main(String[] args) {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        //method sort
        int[] outOfOrder = {9,7,8,2,4,3,6,1,5,0};
        Arrays.sort(outOfOrder);
        System.out.println("outOfOrder[0]: " + outOfOrder[0]);
        System.out.println("outOfOrder[1]: " + outOfOrder[1]);
        System.out.println("outOfOrder[8]: " + outOfOrder[8]);
        System.out.println("outOfOrder[9]: " + outOfOrder[9]);

        String[] orderString = {"Tom","Jerry","Peter","Anna"};
        Arrays.sort(orderString);
        System.out.println(orderString[0]);
        System.out.println(orderString[3]);
    }
}
