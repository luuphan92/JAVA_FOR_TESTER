package com.tvn.session.five.Property.properties;

/**
 * Created by user on 5/16/17 22:57.
 */
public class SystemPropertiesGetPropertyDefault {
    public static void main(String[] args) {

        //return null if the property is not exist
        String invalid1 = System.getProperty("invalid.one");
        System.out.println("invalid.one = " + invalid1);

        //return the default value if the property is not exist
        String invalid2 = System.getProperty("invalid.two","this is default value");
        System.out.println("invalid.two = " + invalid2);
    }
}
