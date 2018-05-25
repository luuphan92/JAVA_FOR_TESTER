package com.tvn.session.two.Contructors;

import java.security.PublicKey;

/**
 * Created by Luu Phan on 24/06/2017.
 */
public class Dog {
    public Dog(){
        System.out.println("This is Puppy");
    }

    public Dog(String name){
        System.out.println("This is " + name);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 =  new Dog("Lucy");
    }
}
