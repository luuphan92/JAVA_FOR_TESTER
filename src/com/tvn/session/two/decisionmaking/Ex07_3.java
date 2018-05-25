package com.tvn.session.two.decisionmaking;

import java.util.Scanner;

/**
 * Created by Luu Phan on 07/07/2017.
 */
public class Ex07_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the correct way to declare a variable to score an interger value in Java?\n" +
                " a. int 1x = 10;\n" +
                " b. int x = 10;\n" +
                " c. float x = 10.0f;\n" +
                " d. string x = 10;");
        System.out.print("Enter your choice: ");
        String choice = sc.next();
        switch (choice) {
            case "a":
                System.out.print("Congratulation!");
                break;
            case "b":
                System.out.print("Invalid Choice");
                break;
            case "c":
                System.out.print("Invalid Choice");
                break;
            case "d":
                System.out.print("Invalid Choice");
            default:
                System.out.println("Invalid Action");

        }

        }
    }