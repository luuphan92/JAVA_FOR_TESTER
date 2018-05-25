package com.tvn.exercises.ExercisesSannerArray;

import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        System.out.println("What is the correct way to store an interger value in Java? \n "
                + "a. int 1x = 10; \n b. int x = 10; \n c. float x = 10.0f; \n d. String x = 10");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String choice = sc.next();
        switch (choice) {
            case "A": System.out.println("Invalid choice");break;
            case "B": System.out.println("Invalid choice");break;
            case "C": System.out.println("Congratulation");break;
            case "D": System.out.println("Invalid choice");break;
        }
    }
}

