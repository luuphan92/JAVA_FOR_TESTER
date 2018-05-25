package com.tvn.exercises.ExercisesSannerArray;

import java.util.Scanner;

public class TriangleType {
    public static void checkTriangle() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Side a: ");
        a = sc.nextInt();
        while (a <= 0) {
            System.out.println("The angle can not be < 0. Please iput again: ");
            a = sc.nextInt();
        }
        System.out.print("Side b: ");
        b = sc.nextInt();
        while (b <= 0) {
            System.out.println("The angle can not be < 0. Please iput again: ");
            b = sc.nextInt();
        }
        System.out.print("Side c: ");
        c = sc.nextInt();
        while (c <= 0) {
            System.out.println("The angle can not be < 0. Please iput again: ");
            c = sc.nextInt();
        }
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && a == c) {
                System.out.println("This is equilateral triangle");
            } else if (a == b || a == c || b == c) {
                System.out.println("This is isoceles riangle");
            } else if (a * a == b * b + c * c || b*b == a*a + c*c || c*c == a*a + b*b )  {
                System.out.println("This is right trangle");
            } else {
                System.out.println("This is scalene triangle");
            }
        }
        else {
            System.out.println("Can not make triangle with those sides");
        }
    }

    public static void main(String[] args) {
        checkTriangle();
    }
}
