package com.tvn.session.five.File;

import java.io.*;

/**
 * Created by user on 3/10/17 01:00.
 */
public class FileCreate2 {
    public static void main(String[] args) throws IOException {

        String[] color = {"black", "white", "yellow", "blue", "green", "grey", "brown"};

        //get current project path and files path
        String dirPath = System.getProperty("user.dir");
        String filePath = dirPath + File.separator + "files" + File.separator;

        //create File Object
        File file = new File(filePath + "color.txt");

        // creates the file
        file.createNewFile();

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);
        BufferedWriter buffer = new BufferedWriter(writer);
        PrintWriter printWriter = new PrintWriter(buffer);

        // Writes the content to the file
        for (String c : color) {
            printWriter.println(c);
        }
        printWriter.close();
        buffer.close();
        writer.close();
    }
}
