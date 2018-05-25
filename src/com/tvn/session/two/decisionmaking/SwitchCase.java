package com.tvn.session.two.decisionmaking;

/**
 * Created by user on 2/24/17 9:02 PM.
 */
public class SwitchCase {
    public static void printComment(char grade) {
        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }

    public static void main(String args[]) {
        printComment('A');
    }
}
