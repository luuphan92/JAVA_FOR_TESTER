package com.tvn.session.six.unchecked_exceptions;

/**
 * Created by user on 3/23/17 01:46.
 */
public class ThrowKeyword {
    static void validate(int old){
        if (old < 14) {
//            System.out.println("Too young");
            throw new ArithmeticException("Invalid: You're too young");
        } else {
            System.out.println("You can do the ID card");
        }
    }
    public static void main(String args[]){
        validate(13);
        System.out.println("This is another code...");
    }
}
