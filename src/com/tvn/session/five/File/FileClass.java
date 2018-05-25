package com.tvn.session.five.File;

import java.io.File;
import java.io.IOException;

/**
 * Created by user on 3/9/17 23:56.
 */
public class FileClass {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");

        String absPath = f.getAbsolutePath();
        System.out.println("absPath = " + absPath);

        String getName = f.getName();
        System.out.println("getName = " + getName);
        
        boolean canExecute = f.canExecute();
        System.out.println("canExecute = " + canExecute);
        
        boolean isExist = f.exists();
        System.out.println("isExist = " + isExist);
    }
}
