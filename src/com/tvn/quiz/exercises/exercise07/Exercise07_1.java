package com.tvn.quiz.exercises.exercise07;

import java.util.Scanner;

/**
 * Created by user on 2/23/17 8:58 PM.
 */
public class Exercise07_1 {
    private static Scanner sc = new Scanner(System.in);

    private static int getScore(int num){
        while(num < 0 || num > 100){
            System.out.print("Invalid score. Please input again: ");
            num = sc.nextInt();
        }
        return num;
    }

    private static String showGrade(){
        String grade;
        System.out.print("Quiz Score: ");
        int quizScore = getScore(sc.nextInt());

        System.out.print("Mid-Term Score: ");
        int midTermScore = getScore(sc.nextInt());

        System.out.print("Final Score: ");
        int finalScore = getScore(sc.nextInt());

        double avgScore = ((double) quizScore + (double) midTermScore + (double) finalScore) / 3;

        if (avgScore > 90) {
            grade = "A";
        }
        else if (avgScore >= 70){
            grade = "B";
        }
        else if(avgScore >= 50){
            grade = "C";
        }
        else{
            grade = "D";
        }

        return grade;
    }

    public static void main(String[] args) {
        System.out.println("Your grade is: " + showGrade());
    }
}
