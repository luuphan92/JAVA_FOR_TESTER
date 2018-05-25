package com.tvn.session.five.Property.properties;

/**
 * Created by user on 5/16/17 23:13.
 */
public class SystemPropertiesGetPropertyApplying {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String user = System.getProperty("user.name");

        if (osName.toLowerCase().contains("windows")) {
            if (osName.toLowerCase().contains("7")) {
                //code for windows 7
                System.out.println("Hello " + user + "! You're using Windows 7");
            }
            else if (osName.toLowerCase().contains("8")) {
                //code for windows 8
                System.out.println("Hello " + user + "! You're using Windows 8");
            }
            else if (osName.toLowerCase().contains("8.1")) {
                //code for windows 8.1
                System.out.println("Hello " + user + "! You're using Windows 8.1");
            }
            else if (osName.toLowerCase().contains("10")) {
                //code for windows 10
                System.out.println("Hello " + user + "! You're using Windows 10");
            }
        } else if (osName.toLowerCase().contains("mac")) {
            //code for mac
            System.out.println("Hello " + user + "! You're using Mac");
        } else {
            //code for linux
            System.out.println("Hello " + user + "! You're using Linux");
        }
    }
}
