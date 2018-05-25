package com.tvn.exercises.one.ex1;

/**
 * Created by Luu Phan on 17/06/2017.
 */
public class DemoString {
    public static void main(String[] args) {
        String greetings = "Hello World";
        System.out.println(greetings);
        String string1 = "This is ";
        String string2 = "Java";
        System.out.println(string1.concat(string2));
        String string3 = "Java for Tester ";
        System.out.println("Yes, this is " + string3 + "course");
        String sentence = "Yes, this is Java for Tester course";
        int len = sentence.length();
        System.out.println("String length is: " + len );
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello1";
        boolean compare = s1.equals(s2);
        System.out.println("compare = " + compare);
        boolean compare1 = s1.equals(s3);
        System.out.println("compare1 = " + compare1);
    }
}