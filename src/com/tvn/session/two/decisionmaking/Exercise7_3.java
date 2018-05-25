package com.tvn.session.two.decisionmaking;
import java.util.Scanner;
/**
 * Created by ChauAndroid on 7/4/2017.
 */
public class Exercise7_3 {
    public static void main(String[] args) {
        System.out.println("What is the correct way to declare a variable to store an integer value in Java? \n a. int 1x= 10; \n b. int x= 10;\n c. float x= 10.0f; \n d. string x =10;");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice :");
        String choice = sc.next();
        switch (choice){
            case "a": System.out.println("congratulation!");break;
            case "b": System.out.println("wrong answer\n");break;
            case "c": System.out.println("wrong answer\n");break;
            case "d": System.out.println("wrong answer\n");break;
            default:  System.out.println("Invalid choice");break;
        }
    }
}
