package com.tvn.quiz.exercises.exercise07;

import java.util.Scanner;

/**
 * Created by user on 2/24/17 5:19 PM.
 */
public class Exercise07_4 {

    public static void main(String[] args) {
        checkTriangle();
    }

    public static void checkTriangle(){
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.print("Please input length of edge a: ");
        a = sc.nextInt();
        System.out.print("Please input length of edge b: ");
        b = sc.nextInt();
        System.out.print("Please input length of edge c: ");
        c = sc.nextInt();

        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            System.out.println("There is at least one invalid length of edge. Please check again!");
            return;
        }
        if ((a + b < c) || (a + c < b) || (b + c < a)){
            System.out.println("Cannot make triangle with these edges");
            return;
        }
        if ((a == b) && (a == c)) {
            System.out.println("This is equilateral triangle");
            return;
        }
        if ((a == b) || (b == c) || (a == c)){
            System.out.println("This is isosceles triangle");
            return;
        }
        if ((a * a + b * b == c * c) || (a * a + c * c == b * b) ||  (b * b + c * c == a * a)){
            System.out.println("This is right triangle");
        }
        else {
            System.out.println("This is scalene triangle");
        }
    }
}
