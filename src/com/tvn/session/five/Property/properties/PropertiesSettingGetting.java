package com.tvn.session.five.Property.properties;

import java.util.Properties;

/**
 * Created by user on 5/17/17 21:03.
 */
public class PropertiesSettingGetting {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("site_host_name", "testing.vn");
        properties.setProperty("site_port", "443");

        String siteHostName = properties.getProperty("site_host_name");
        String sitePort = properties.getProperty("site_port");
        System.out.println("siteHostName = " + siteHostName);
        System.out.println("sitePort = " + sitePort);

        String missing = properties.getProperty("missing");
        String proxy = properties.getProperty("proxy", "localhost");
        System.out.println("missing = " + missing);
        System.out.println("proxy = " + proxy);

    }
}
