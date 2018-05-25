package com.tvn.session.six.unchecked_exceptions;

/**
 * Created by user on 5/26/17 22:06.
 */
public class TryCatchExample2 {
    public static void main(String args[]){
        try {
            int  data = 50/0;
        }catch (ArithmeticException e){
            System.out.println("This is code from catch block");
        }
        System.out.println("This is another code...");
    }
}
