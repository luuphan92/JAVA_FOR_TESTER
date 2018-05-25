package com.tvn.session.two.Arry;

/**
 * Created by user on 6/30/17 23:11.
 */
public class ArrayExample2 {
    private static void setElementsValue() {
        double[] myDoubleList = new double[10];

        myDoubleList[0] = 1.2;
        myDoubleList[1] = 2.3;
        myDoubleList[9] = 10.0;
        System.out.println("myDoubleList[0]: " + myDoubleList[0]);
        System.out.println("myDoubleList[1]: " + myDoubleList[1]);
        System.out.println("myDoubleList[9]: " + myDoubleList[9]);
        System.out.println("myDoubleList[2]: " + myDoubleList[2]);
    }

    public static void main(String[] args) {
        setElementsValue();
    }
}
