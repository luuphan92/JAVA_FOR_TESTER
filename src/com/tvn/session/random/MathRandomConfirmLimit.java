package com.tvn.session.random;

/**
 * Created by user on 5/11/17 21:01.
 */
public class MathRandomConfirmLimit {
    public static void main(String[] args) {
        //confirm limits of Math.random()
        for (int i = 0; i < 1000; i++) {
            double randomNum = Math.random();
            if ((randomNum < 0.0) || (randomNum >= 1.0d)){
                System.out.println("We should redefine the Java concept");
            }
        }
    }
}
