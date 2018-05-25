package com.tvn.session.five.Property.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by user on 5/16/17 21:35.
 */
public class PropertiesFilesWrite {
    public static void main(String[] args) throws IOException {
        String workingDirectory = System.getProperty("user.dir");
        String resourceFilePath = workingDirectory + "/src/com/tvn/resources/properties_files/example.properties";

        Properties props = new Properties();
        FileReader in = new FileReader(resourceFilePath);
        props.load(in);
        in.close();

        props.setProperty("browser", "firefox");
        props.setProperty("site_protocol", "https");

        FileWriter out = new FileWriter(resourceFilePath);
        props.store(out, "Updated properties file");
        out.close();
    }
}
