package com.tvn.exercises.ExercisesSannerArray;

import java.util.Scanner;

class TriangleType1 {
    private static void checkTriangle() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Side a: ");
        a = checkNumber(sc.nextInt());

        System.out.print("Side b: ");
        b = checkNumber(sc.nextInt());

        System.out.print("Side c: ");
        c = checkNumber(sc.nextInt());

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
    private static Scanner sc = new Scanner(System.in);
    private static int checkNumber(int num){
        while(num < 0){
            System.out.print("Invalid number. Please input again: ");
            num = sc.nextInt();
        }
        return num;
    }

    public static void main(String[] args) {
        checkTriangle();

    }
    }
