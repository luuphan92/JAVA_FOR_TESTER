package com.tvn.session.five.path;

import java.io.File;

/**
 * Created by user on 3/10/17 01:44.
 */
public class Path {
    public static void main(String[] args) {
        //get current project path and files path
        String dirPath = System.getProperty("user.dir");
        System.out.println("dirPath = " + dirPath);
        
        String filePath = dirPath + File.separator + "files" + File.separator;
        System.out.println("filePath = " + filePath);
    }
}
