package com.tvn.session.two.decisionmaking;

import java.util.Scanner;

/**
 * Created by ChauAndroid on 7/4/2017.
 */
public class Exercise7_4 {

    public static void main(String[] args) {

        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print ("nhap do dai canh a:");
        a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print ("nhap do dai canh b:");
        b = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print ("nhap do dai canh c:");
        c = sc2.nextInt();
        if (( (a+b)> c) && ( (a+c)> b)&&( (c+b)> a) ) {
            if (a == b && a == c && b==c)
                System.out.println("This is equilateral triangle ");
             else if (a == b || a == c || b==c)
                System.out.println("This is isosceles triangle");
             else if(c*c==(a*a + b*b) || a*a==(b*b + c*c) || b*b==(a*a + c*c))
                System.out.println("This is Square triangle ");
             else
                System.out.println("This is Right triangle ");
        }
        else System.out.println("khong phai tam giac");
    }
}
