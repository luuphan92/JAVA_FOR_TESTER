package com.tvn.session.five.date_and_time;

/**
 * Created by user on 3/9/17 4:07 PM.
 */
public class SystemCurrentTimeMillisFileName {
    public static void main(String[] args) {

        //unique filename 1
        long currentTime = System.currentTimeMillis();
        String filename1 = "file_" + currentTime;
        System.out.println("filename1 = " + filename1);

        //unique filename 2
        String filename2 = "file_" + System.currentTimeMillis();;
        System.out.println("filename2 = " + filename2);

    }
}
