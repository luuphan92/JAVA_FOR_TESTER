package com.tvn.exercises.ExercisesSannerArray;

import java.util.Scanner;

public class Revenue {
    public static void calculateRevenue() {
        Scanner sc = new Scanner(System.in);
        double unitPrice,quantity, revenue, discount, totalDiscount;

        System.out.print("Enter the unit price: ");
        unitPrice = sc.nextInt();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        double total = unitPrice * (int) quantity;

        if (unitPrice > 120) {
            discount = 0.15;
            revenue = total - total * discount;
        } else if (unitPrice > 100) {
            discount = 0.1;
            revenue = total - total * discount;
        } else {
            discount = 0;
            revenue = total;
        }
        totalDiscount = total * discount;
        System.out.println("The revenue from sale is: " + revenue);
        System.out.println("After discount: " + totalDiscount + "(" + discount + ")");
    }
    public static void main(String[] args) {
        calculateRevenue();
    }
}
