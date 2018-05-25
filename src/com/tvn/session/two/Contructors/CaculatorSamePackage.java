package com.tvn.session.two.Contructors;

/**
 * Created by user on 6/24/17 07:38.
 */
public class CaculatorSamePackage {
    public static void main(String[] args) {
        System.out.println("10 + 20 = " + Calculator.addTwoNumber(10,20));

        Calculator calculator = new Calculator();
        System.out.println("7 + 8 = " + calculator.addTwoNumber(7,8));
    }
}
