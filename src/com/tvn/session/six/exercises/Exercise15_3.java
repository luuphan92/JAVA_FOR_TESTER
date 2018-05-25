package com.tvn.session.six.exercises;

/**
 * Created by user on 3/23/17 02:27.
 */
public class Exercise15_3 {
    public static void main(String[] args) {
        String str = "javaForTestersClass";
        try {
            System.out.println("String length: " + str.length());
            char c = str.charAt(0);
            c = str.charAt(40);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException!!!");
            System.out.println(e.getMessage());

        }

    }
}
