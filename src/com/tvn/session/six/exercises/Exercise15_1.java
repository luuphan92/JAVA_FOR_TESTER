package com.tvn.session.six.exercises;

/**
 * Created by user on 3/23/17 02:21.
 */
public class Exercise15_1 {
    public static void main(String[] args) {

        try {
            int num1 = 30, num2 = 0;
            int output = num1 / num2;
            System.out.println ("Result = " + output);
        } catch (ArithmeticException e) {
            System.out.println("You cant devide an interger by 0");
        }

}
}
