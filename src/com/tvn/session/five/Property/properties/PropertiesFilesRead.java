package com.tvn.session.five.Property.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by user on 5/16/17 21:21.
 */
public class PropertiesFilesRead {
    public static void main(String[] args) throws IOException {
        String workingDirectory = System.getProperty("user.dir");
        String resourceFilePath = workingDirectory + "/src/com/tvn/resources/properties_files/example.properties";

        Properties props = new Properties();
        FileReader in = new FileReader(resourceFilePath);
        props.load(in);
        in.close();

        String siteHostName = props.getProperty("site_host_name");
        System.out.println("siteHostName = " + siteHostName);

        String sitePort = props.getProperty("site_port");
        System.out.println("sitePort = " + sitePort);

    }
}
