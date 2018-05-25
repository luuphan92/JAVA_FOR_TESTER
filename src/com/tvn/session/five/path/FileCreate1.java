package com.tvn.session.five.path;

import java.io.*;

/**
 * Created by user on 3/10/17 01:12.
 */
public class FileCreate1 {
    public static void main(String[] args) throws IOException {

        //get current project path and files path
        String dirPath = System.getProperty("user.dir");
        String filePath = dirPath + File.separator + "files" + File.separator;

        //create File Object
        File file = new File(filePath + "sample.txt");

        // creates the file
        file.createNewFile();

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);
        BufferedWriter buffer = new BufferedWriter(writer);
        PrintWriter printWriter = new PrintWriter(buffer);

        // Writes the content to the file
        printWriter.println("Hello");
        printWriter.println("This is writer sample");
        printWriter.println("And this should be the last line");
        printWriter.close();
        buffer.close();
        writer.close();

    }
}
