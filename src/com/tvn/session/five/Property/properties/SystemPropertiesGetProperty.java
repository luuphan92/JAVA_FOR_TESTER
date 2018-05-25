package com.tvn.session.five.Property.properties;

/**
 * Created by user on 5/16/17 21:42.
 */
public class SystemPropertiesGetProperty {
    public static void main(String[] args) {
        String file_separator = System.getProperty("file.separator");
        System.out.println("file.separator = " + file_separator);
    }
}
