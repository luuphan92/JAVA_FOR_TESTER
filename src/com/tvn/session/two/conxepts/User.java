package com.tvn.session.two.conxepts;

/**
 * Created by user on 4/21/17 23:35.
 */
public class User {
    String username;
    String password;

    public User(){
        username = "user";
        password = "123456";
    }

    public User(String usr, String pwd){
        username = usr;
        password = pwd;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        User user1 = new User();
        System.out.println("user1 username: " + user1.getUserName());
        System.out.println("user1 password: " + user1.getPassword());

        User user2 = new User("tom","12345678x@X");
        System.out.println("user1 username: " + user2.getUserName());
        System.out.println("user1 password: " + user2.getPassword());
    }
}
