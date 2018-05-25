package com.tvn.session.two.Contructors;

/**
 * Created by Luu Phan on 24/06/2017.
 */
public class Company {

    public Company(){
        System.out.println("This is my company");
    }

    public Company(int year) {
        System.out.println("My company runs for " + year  + " year");
    }

    public Company(String name){
        System.out.println("It is " + name);
    }


    public static void main(String[] args) {
        Company company1 = new Company();
        Company company2 = new Company(2);
        Company company3 = new Company("Luu");
    }

}
