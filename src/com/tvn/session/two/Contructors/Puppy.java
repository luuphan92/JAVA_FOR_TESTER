package com.tvn.session.two.Contructors;

/**
 * Created by Luu Phan on 24/06/2017.
 */
public class Puppy {
    public Puppy(String name){
        // This contructor has one parameter, name.
        System.out.println("Puppy object is created: " + name);
    }
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Lucy");
    }
}
