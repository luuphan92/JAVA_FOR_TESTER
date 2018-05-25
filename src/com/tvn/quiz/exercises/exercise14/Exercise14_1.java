package com.tvn.quiz.exercises.exercise14;

import java.io.*;
import java.util.Scanner;

/**
 * Created by user on 3/10/17 02:20.
 */
public class Exercise14_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        System.out.println("Checking to see if username exists...");

        try {
            checkUsername(username);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkUsername(String username) throws IOException {
        String dirPath = System.getProperty("user.dir");
        String filePath = dirPath + File.separator + "files" + File.separator;

        File file = new File(filePath + "user_info.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;
        boolean usernameExists = false;

        while ((s = br.readLine()) != null){
            if(s.toLowerCase().equals(username.toLowerCase())){
                usernameExists = true;
            }
        }
        if (usernameExists){
            System.out.println("Username exists! Please try again.");
        }
        else {
            System.out.println("Username is accepted!");
        }
        br.close();
        fr.close();
    }
}
