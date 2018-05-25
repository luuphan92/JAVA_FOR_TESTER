package com.tvn.session.five.Property.properties;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by user on 5/16/17 19:44.
 */
public class SystemPropertiesExample2 {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        Enumeration keys = p.keys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String value = (String) p.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
