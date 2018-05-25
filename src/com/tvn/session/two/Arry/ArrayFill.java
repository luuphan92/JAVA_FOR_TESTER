package com.tvn.session.two.Arry;

import java.util.Arrays;

/**
 * Created by user on 5/5/17 17:39.
 */
public class ArrayFill {
    public static void main(String[] args) {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        //method fill
        int[] minusOne = new int[30];
        Arrays.fill(minusOne,-1);
        System.out.println("minusOne[0]: " + minusOne[0]);
        System.out.println("minusOne[29]: " + minusOne[29]);

        int[] tenItems = {0,0,0,0,0,1,1,1,1,1};
        Arrays.fill(tenItems,5,10,2);
        System.out.println("tenItems[5]: " + tenItems[5]);
        System.out.println("tenItems[6]: " + tenItems[6]);
        System.out.println("tenItems[9]: " + tenItems[9]);
    }
}
