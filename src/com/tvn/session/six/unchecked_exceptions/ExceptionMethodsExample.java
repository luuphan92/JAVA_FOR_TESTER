package com.tvn.session.six.unchecked_exceptions;

/**
 * Created by user on 5/26/17 21:52.
 */
public class ExceptionMethodsExample {
    public static void main(String args[]){
        try {
            int  data = 50/0;
        }catch (ArithmeticException e){
            System.out.println("getClass(): " + e.getClass());
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("toString(): " + e.toString());
            e.printStackTrace();
        }
        System.out.println("This is another code...");
    }
}
