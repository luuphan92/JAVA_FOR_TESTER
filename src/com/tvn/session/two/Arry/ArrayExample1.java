package com.tvn.session.two.Arry;

/**
 * Created by user on 2/21/17 3:54 PM.
 */
public class ArrayExample1 {

    private static void showArrayExample() {
        double[] myList = {5.6,4.5,3.3,13.2,4.0,34.33,34.0,45.45,99.993,1112.3};

        try {
            System.out.println("myList[0]: " + myList[0]); //5.6
            System.out.println("myList[1]: " + myList[1]); //4.5
            System.out.println("myList[9]: " + myList[9]); // 1112.3
            System.out.println("myList[12]: " + myList[12]); //access elemnent out of range
        }
        catch(IndexOutOfBoundsException e){
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        showArrayExample();
    }
}
