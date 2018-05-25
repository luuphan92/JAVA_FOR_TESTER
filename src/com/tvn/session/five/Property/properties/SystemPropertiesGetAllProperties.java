package com.tvn.session.five.Property.properties;

import java.util.Properties;

/**
 * Created by user on 5/16/17 19:20.
 */
public class SystemPropertiesGetAllProperties {
    public static void main(String[] args) {

        // this will list the current system properties
        Properties props = System.getProperties();
        props.list(System.out);
    }
}
