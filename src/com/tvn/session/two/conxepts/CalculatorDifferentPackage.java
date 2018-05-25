package com.tvn.session.two.conxepts;

import com.tvn.session.two.Contructors.Calculator;

/**
 * Created by Luu Phan on 24/06/2017.
 */

public class CalculatorDifferentPackage {
    public static void main(String[] args) {
        System.out.println("13 +17 =" + Calculator.addTwoNumber(13, 17));

        Calculator calculator = new Calculator();
        System.out.println("8 + 8 =" + Calculator.addTwoNumber(8, 8));
    }
}
