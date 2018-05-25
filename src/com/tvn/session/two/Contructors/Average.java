package com.tvn.session.two.Contructors;

/**
 * Created by Luu Phan on 24/06/2017.
 */
public class Average {
    public static float average(float a,float b,float c){
            return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        double avg = average(9, 6, 7);
        System.out.println("avg = " + avg);

    }

}
