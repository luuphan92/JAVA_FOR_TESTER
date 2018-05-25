package com.tvn.session.two.Contructors.Practice;

public class PracticeUser {
    String username;
    String password;

    public PracticeUser() {
        username = "user";
        password = "123456";
    }

    public PracticeUser(String usr, String pwd) {
        username = usr;
        password = pwd;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {


    }
}
