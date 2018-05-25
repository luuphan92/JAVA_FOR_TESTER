package com.tvn.quiz.exercises.exercise07;

import java.util.Scanner;

/**
 * Created by user on 2/23/17 9:25 PM.
 */
public class Exercise07_2 {

    public static void calculateRevenue() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        int unitPrice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        double discount_rate = 0, discount_amount = 0, revenue = 0;

        if (qty < 100){
            revenue = unitPrice * qty;
        }
        if (qty >= 100 && qty <= 120){
            discount_rate = (double) 10/100;
            revenue = unitPrice * qty;
            discount_amount = revenue * discount_rate;
            revenue = revenue - discount_amount;
        }
        if (qty > 120) {
            discount_rate = (double) 15/100;
            revenue = unitPrice * qty;
            discount_amount = revenue * discount_rate;
            revenue = revenue - discount_amount;
        }

        System.out.println("The revenue from sale: " + revenue);
        System.out.println("After discount: " + discount_amount + "(" + discount_rate * 100 + "%)");
    }

    public static void main(String[] args) {
        calculateRevenue();
    }
}
