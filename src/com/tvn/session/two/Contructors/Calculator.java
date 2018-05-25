package com.tvn.session.two.Contructors;

/**
 * Created by user on 6/24/17 06:58.
 */
public class Calculator {
    public static int addTwoNumber(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int twoPlusThree = addTwoNumber(2, 3);
        System.out.println("2 + 3 = " + twoPlusThree);

        int threePlusFour = Calculator.addTwoNumber(3,4);
        System.out.println("3 + 4 = " + threePlusFour);

        Calculator calculator = new Calculator();
        int fivePlusSix = calculator.addTwoNumber(5,6);
        System.out.println("5 + 6 = " + fivePlusSix);
    }
}
