package com.tvn.session.loop_control;

import java.util.Scanner;

/**
 * Created by user on 7/8/17 07:30.
 */
public class WhileLoopExample {
    private static Scanner sc = new Scanner(System.in);

    private static int checkNumber(int num){
        while(num < 1 || num > 10){ // || (hoặc)
            System.out.print("Invalid number. Please input again: ");
            num = sc.nextInt();
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.print("Please input number between 1 to 10: ");
        int number = checkNumber(sc.nextInt());

        System.out.println("Your number is: " + number);
    }
}
