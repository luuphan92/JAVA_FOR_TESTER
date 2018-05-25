package com.tvn.session.two.decisionmaking;

import java.util.Scanner;

/**
 * Created by user on 5/5/17 20:40.
 */
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = sc.next(); // nhap data dang String

        System.out.print("How old are you? ");
        int age = sc.nextInt(); // cho nguoi dung nhap dang int

        System.out.println("Hello " + name);
        System.out.println("I know you're " + age + " years old");

    }
}
