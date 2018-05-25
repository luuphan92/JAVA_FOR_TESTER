package com.tvn.session.six.unchecked_exceptions;

/**
 * Created by user on 3/23/17 00:20.
 */
public class TryCatchExample {
    public static void main(String args[]){
        try {
          int  data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("This is another code...");
    }
}
