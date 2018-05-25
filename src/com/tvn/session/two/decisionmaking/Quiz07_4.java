package com.tvn.session.two.decisionmaking;

/**
 * Created by user on 5/5/17 23:16.
 */
public class Quiz07_4 {
    public static double calculateDiscount(String membership, int purchaseOrder) {
        double discount = 0;

        if (membership.equals("Loyalty")) {
            if (purchaseOrder > 100) {
                discount = purchaseOrder * 0.1;
            } else if (purchaseOrder > 500) {
                discount = purchaseOrder * 0.2;
            }
        } else if (membership.equals("Vip")) {
            if (purchaseOrder > 100) {
                discount = purchaseOrder * 0.15;
            } else if (purchaseOrder > 300) {
                discount = purchaseOrder * 0.2;
            } else {
                discount = purchaseOrder * 0.05;
            }
        } else {
            if (purchaseOrder > 100) {
                discount = purchaseOrder * 0.05;
            }
        }

        return discount;
    }

    public static void main(String[] args) {
        System.out.println("Discount: " + calculateDiscount("Loyalty", 150));
    }
}
