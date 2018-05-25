package com.tvn.session.two.decisionmaking;
import java.util.Scanner;
/**
 * Created by ChauAndroid on 7/3/2017.
 */
public class Exercise7_1 {

    public static void main(String[] args) {


        double quizscore =0,midTerm=0,finalscore=0;

        Scanner sc = new Scanner(System.in);
        System.out.print ("Quiz score:");
        quizscore = sc.nextInt();
        System.out.print ("mid-Term score:");
        midTerm = sc.nextInt();
        System.out.print ("mid-Term score:");
        finalscore = sc.nextInt();
        double average = (quizscore +  midTerm +finalscore )/3;
        System .out.println (+average);

        if (average >(90))
            System .out.println ("grade A");
        else if (average >70 && average <=90)
            System .out.println ("grade B");
        else if(average >50 && average <= 70)
            System .out.println ("grade C");
        else if (average <= (50))
            System .out.println ("grade D");

    }

}
