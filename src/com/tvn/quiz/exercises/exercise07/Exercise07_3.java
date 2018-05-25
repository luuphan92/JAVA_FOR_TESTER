package com.tvn.quiz.exercises.exercise07;

import java.util.Scanner;

/**
 * Created by user on 2/24/17 11:56 AM.
 */
public class Exercise07_3 {

    static Scanner sc = new Scanner(System.in);

    public static String getAnswer(String answer) {
        while (!answer.toLowerCase().equals("a")
                && !answer.toLowerCase().equals("b")
                && !answer.toLowerCase().equals("c")
                && !answer.toLowerCase().equals("d")) {
            System.out.print("Input again: ");
            answer = sc.next();
        }

        return answer;
    }

    public static void selectChoice() {
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println("a. int 1x=10");
        System.out.println("b. int x=10");
        System.out.println("c. float x=10.0f");
        System.out.println("d. string x=\"10\"");
        System.out.print("Enter your choice: ");

        String answer = getAnswer(sc.next());

        switch (answer.toLowerCase()) {
            case "a":
                System.out.println("Invalid Choice.");
                break;
            case "b":
                System.out.println("Invalid Choice.");
                break;
            case "c":
                System.out.println("Congratulation!");
                break;
            case "d":
                System.out.println("Invalid Choice.");
                break;
        }
    }

    public static void main(String[] args) {
        selectChoice();
    }
}
