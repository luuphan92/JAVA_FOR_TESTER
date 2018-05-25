package com.tvn.session.five.path;

import java.io.*;

/**
 * Created by user on 3/9/17 23:59.
 */
public class FileReader {
    public static void main(String args[]) throws IOException {

        String dirPath = System.getProperty("user.dir");
        String filePath = dirPath + File.separator + "files" + File.separator;

        File file = new File(filePath + "items.txt");

        java.io.FileReader fr = new java.io.FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;

        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        br.close();
        fr.close();
    }
}
