package com.tvn.session.two.decisionmaking;

import java.util.Scanner;

/**
 * Created by Luu Phan on 05/07/2017.
 */
public class Ex07_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitPrice = 0, quantity = 0;

        System.out.print("Enter unit price: ");
        unitPrice = sc.nextInt();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        if (quantity > 100 && quantity < 120) {
            System.out.println("The revenue from sale:" + (unitPrice * quantity * 0.9) + "$");
            System.out.println("After discount:" + (unitPrice * quantity * 0.1) + "$" + "(10$)");
        }
        else if (quantity > 120) {
            System.out.println("The revenue from sale:" + (unitPrice * quantity * 0.85) + "$");
            System.out.println("After discount:" + (unitPrice * quantity * 0.15) + "$" + "(15$)");
        }
        else{
            System.out.println("The revenue from sale:" + (unitPrice * quantity) + "$");
            System.out.println("After discount:" + "0%");
        }
    }
}
