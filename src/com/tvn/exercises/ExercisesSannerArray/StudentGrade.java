package com.tvn.exercises.ExercisesSannerArray;

import java.util.Scanner;

public class StudentGrade {
    public static void calculateAverage() {
        Scanner sc = new Scanner(System.in);
        double score, quizScore, midScore, finalScore;

        System.out.print("Quiz Score ");
        quizScore = sc.nextInt();
        while (quizScore > 100 || quizScore < 0) {
            System.out.print("This is unvalid.Please iput again: " );
            quizScore = sc.nextInt();
        }

        System.out.print("Mid-term Score ");
        midScore = sc.nextInt();
        while (midScore > 100 || midScore < 0) {
            System.out.print("This is unvalid.Please iput again: ");
            midScore = sc.nextInt();
        }

        System.out.print("Final Score ");
        finalScore = sc.nextInt();
        while (finalScore > 100 || finalScore < 0) {
            System.out.print("This is unvalid.Please iput again: ");
            finalScore = sc.nextInt();
        }
        score = (quizScore + midScore + finalScore ) /3;

        System.out.println("Your score: " + score);

        if (score > 90) {
            System.out.println("Your grade is " + "A");
        }
        else if (score > 70) {
            System.out.println("Your score is " + "B");
        }
        else if (score > 50) {
            System.out.println("Your grade is " + "C");
        } else if (score <= 50) {
            System.out.println("Your grade is " + "D");
        }
        }

    public static void main(String[] args) {
        calculateAverage();
    }
    }
