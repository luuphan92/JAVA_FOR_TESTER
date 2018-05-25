package com.tvn.session.six.unchecked_exceptions;

/**
 * Created by user on 3/23/17 01:12.
 */
public class FinallyBlock {
    public static void main(String args[]) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three :" + a[4]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }// cách để đóng file, k tốn bộ nhớ
    }
}
